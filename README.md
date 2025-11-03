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

## 🧰 Tech Stack

| Area | Technology |
|------|-------------|
| **Frontend** | React + Vite ![React](https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB) ![Vite](https://img.shields.io/badge/Vite-646CFF?style=for-the-badge&logo=vite&logoColor=white) |
| **Backend** | Spring Boot (Java) ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white) |
| **Extension** | Chrome Extension (Manifest V3) ![Chrome](https://img.shields.io/badge/Chrome_Extension-4285F4?style=for-the-badge&logo=googlechrome&logoColor=white) |
| **AI Integration** | Gemini API ![Gemini](https://img.shields.io/badge/Gemini_AI-8E75FF?style=for-the-badge&logo=google&logoColor=white) |
| **Build Tools** | Maven & Node.js ![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white) ![Node.js](https://img.shields.io/badge/Node.js-339933?style=for-the-badge&logo=nodedotjs&logoColor=white) |
| **Version Control** | Git + GitHub ![Git](https://img.shields.io/badge/Git-F05033?style=for-the-badge&logo=git&logoColor=white) ![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white) |


---

## ⚙️ Project Structure

```AI-EMAIL-WRITER/
├── email-writer-ext/ 
│ ├── content.css 
│ ├── content.js 
│ └── manifest.json 

├── email-writer-react/ 
│ ├── public/ 
│ ├── src/ 
│ │ ├── assets/ 
│ │ │ └── react.svg
│ │ ├── App.css
│ │ ├── App.jsx 
│ │ ├── index.css 
│ │ └── main.jsx 
│ ├── .gitignore
│ ├── eslint.config.js
│ ├── index.html
│ ├── package.json
│ ├── package-lock.json
│ ├── vite.config.js
│ └── README.md

├── email-writer-sb/ 
│ ├── .mvn/ 
│ ├── src/
│ │ ├── main/
│ │ │ ├── java/com/email/email_writer_sb/app/
│ │ │ │ └── EmailWriterSbApplication.java 
│ │ │ └── resources/
│ │ └── test/ 
│ ├── .gitignore
│ ├── .gitattributes
│ ├── mvnw
│ ├── mvnw.cmd
│ └── pom.xml 
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
**🧩 Step 3: Load the Chrome Extension**
 1. Open Chrome and go to:
 ```
 chrome://extensions/ 
 ```
 2. Enable Developer Mode (top-right corner).
 3. Click “Load unpacked” and select the folder you put the whole application in.
 4. The extension will now appear in your Chrome toolbar.

**💬 Step 4: Use in Gmail**
  1. Go to Gmail.
  2. Open any email and click Reply.
  3. You’ll now see an AI Reply button next to Send.
  4. Click it — Gemini will generate a context-aware draft reply instantly.

---

##  Demo 🎥

 **📸 AI Reply Button Inside Gmail**

   <img width="600" height="300" alt="Image" src="https://github.com/user-attachments/assets/8a618160-470f-4756-b83c-c040b8072a18" />

 **🧠 Generated Gemini Reply**

   <img width="600" height="300" alt="Image" src="https://github.com/user-attachments/assets/8ec9e420-9bd1-445e-b6ea-301230c1d2e4" />

---
*Save your time and write contextual replies with the help of this extension*
---

# Author

**MD FAIZ**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/ffaaiizz/)
[![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:thefaiz202@gmail.com)

---

# License
See the  [LICENSE](LICENSE.txt)

![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)



