# 💌 AI Email Writer (Gmail + Gemini AI Integration)

An **AI-powered Chrome Extension** that enhances Gmail by automatically generating intelligent, context-aware email replies using **Google’s Gemini API**.  

This project combines the power of:
- ⚛️ **React** for an interactive and modern user interface  
- ☕ **Spring Boot (Java)** for backend logic and Gemini API communication  
- 🧩 **Chrome Extension** for seamless integration directly inside Gmail  

---

## 🧠 Features

- ✉️ **AI Reply Button** inside Gmail — just click it and let Gemini draft your reply  
- 🤖 **Smart Context Analysis** — understands the received email’s tone and content  
- 🌐 **Full-Stack Integration** — connects Chrome, React, and Java backend  
- 🚀 **Gemini API Integration** — brings cutting-edge AI writing to Gmail  

---

##  🧰 Tech Stack Used


## ⚙️ Project Structure

```AI-EMAIL-WRITER/
├── email-writer-ext/ # 🧩 Chrome Extension Files
│ ├── content.css # Styles for injected UI in Gmail
│ ├── content.js # Injects AI Reply button logic
│ └── manifest.json # Chrome Extension Manifest (v3)

├── email-writer-react/ # ⚛️ React Frontend
│ ├── public/ # Public assets and index.html
│ ├── src/ # React source code
│ │ ├── assets/ # Icons, logos, and static assets
│ │ │ └── react.svg
│ │ ├── App.css # Main styling
│ │ ├── App.jsx # Root component
│ │ ├── index.css # Global CSS
│ │ └── main.jsx # Entry point for React
│ ├── .gitignore
│ ├── eslint.config.js
│ ├── index.html
│ ├── package.json
│ ├── package-lock.json
│ ├── vite.config.js
│ └── README.md

├── email-writer-sb/ # ☕ Spring Boot Backend
│ ├── .mvn/ # Maven wrapper files
│ ├── src/
│ │ ├── main/
│ │ │ ├── java/com/email/email_writer_sb/app/
│ │ │ │ └── EmailWriterSbApplication.java # Main Spring Boot app
│ │ │ └── resources/ # application.properties, templates, etc.
│ │ └── test/ # Optional: JUnit test files
│ ├── .gitignore
│ ├── .gitattributes
│ ├── mvnw
│ ├── mvnw.cmd
│ └── pom.xml # Maven configuration

└── README.md # Project documentation
```
---


---

## 🧩 How to Run This Project

**🖥️ Step 1 : Run the Spring Boot server:**
```bash
./mvnw spring-boot:run
```
**⚛️ Step 2 : Run the Frontend**
```bash
cd email-writer-react
npm install
npm run dev
```
 It should be running at:
 ```
  http://localhost:5173/
 ```
**🧩 Step 3: Load the Chrome Extension
 1. Open Chrome and go to:
 ```
 chrome://extensions/ 
 ```
 2. Enable Developer Mode (top-right corner).
 3. Click “Load unpacked” and select the folder you put the whole application in.
 4. The extension will now appear in your Chrome toolbar.

**💬 Step 4: Use in Gmail
  1. Go to Gmail.
  2. Open any email and click Reply.
  3. You’ll now see an AI Reply button next to Send.
  4. Click it — Gemini will generate a context-aware draft reply instantly.

---

##  Demo 🎥

# AI Reply Button Inside Gmail 📸

   <img width="915" height="561" alt="Image" src="https://github.com/user-attachments/assets/8a618160-470f-4756-b83c-c040b8072a18" />

# Generated Gemini Reply 🧠

   <img width="1033" height="537" alt="Image" src="https://github.com/user-attachments/assets/8ec9e420-9bd1-445e-b6ea-301230c1d2e4" />


