package com.email.email_writer_sb.app;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
public class EmailGeneratorController {
    private final EmailGeneratorService egenser;
    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest er){
        String response=egenser.generateEmailReply(er);
        return ResponseEntity.ok(response);
    }
}
