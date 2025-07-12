# AI-EMAIL-WRITER
This is a fullstack application that enhances Gmail with Gemini AI assistence to write mail replies using a Chrome extension.
It includes:
 ->React Frontend(User Interface)
 ->Java backend(SpringBoot to connect with Gemini API)
 ->Chrome extension that integrates with Gmail


How to run this project:

  1. Fire up the backend:
       Run the main() function of the backend files
       or on your bash terminal fire the command 'mvn spring-boot:run'
  2. Get the frontend running:
       Change directory to 'email-writer-react' by firing
       'cd email-writer-react' on your bash terminal.
       Then type the command 'npm run dev' to start the react application.
  3. Load the extension folder to the google extension manager.
       Go to your Gmail page,select a mail, click reply button, on the compose page
       you will see a 'AI Reply' button near the 'Send' button. Click the AI reply button
       and the application will generate an AI based reply of the mail.


