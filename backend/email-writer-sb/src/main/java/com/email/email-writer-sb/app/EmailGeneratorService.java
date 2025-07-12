package com.email.email_writer_sb.app;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EmailGeneratorService {

    @Value("${gemini.api.url}")
    private String geminiApiUrl;

    @Value("${gemini.api.key}")
    private String geminiApiKey;

    private final WebClient wc;
    
    public EmailGeneratorService(WebClient.Builder wcbBuilder){
        this.wc=wcbBuilder.build();
    }
    @SuppressWarnings("UseSpecificCatch")
    private String extractResponseContent(String response){
        try{
            ObjectMapper mapper=new ObjectMapper();
            JsonNode rootNode=mapper.readTree(response);
            return rootNode.path("candidates").get(0)
                .path("content")
                .path("parts").get(0)
                .path("text")
                .asText();
        }catch(Exception e){
            return "Error processing request : "+e.getMessage();
        }
    }
   

    public String generateEmailReply(EmailRequest er) {
        String prompt = buildPrompt(er);

        @SuppressWarnings("unused")
        Map<String, Object> requestBody = Map.of(
                "contents", new Object[]{
                        Map.of("parts", new Object[]{
                                Map.of("text", prompt)
                        })
                }
        );

       
    
        // req and get response
        String response= wc.post()
                    .uri(geminiApiUrl+geminiApiKey)
                    .header("Content-Type","application/json")
                    .bodyValue(requestBody)
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();
        //return response
        return extractResponseContent(response);


    }    
   
            

    private String buildPrompt(EmailRequest er) {
        StringBuilder prompt = new StringBuilder();
        prompt.append("Generate a professional email reply for the following email content. Please don't generate a subject line. ");
        if (er.getTone() != null && !er.getTone().isEmpty()) {
            prompt.append("Use a ").append(er.getTone()).append(" tone. ");
        }
        prompt.append("\nOriginal email:\n").append(er.getEmailContent());
        return prompt.toString();
    }
}
