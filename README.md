# Emergency-Home-Services
# 🚨 Emergency Home Service System

A full-stack web application for booking and managing emergency home services such as electrician, plumber, carpenter, doctor, mechanic, and cleaning services.

---

## 💡 Project Overview

This system allows users to request emergency home services online.  
An admin can view all requests and update their status (PENDING → COMPLETED).

The project is built using **Spring Boot (Backend)** and **HTML/CSS/JavaScript (Frontend)**.

---

## 🛠 Tech Stack

- Frontend: HTML, CSS, JavaScript
- Backend: Spring Boot (Java)
- Database: MySQL
- API: REST API
- Build Tool: Maven

---

## 📌 Features

### 👤 User Side:
- Create service request
- Select service type (Electrician, Plumber, Carpenter, Doctor, etc.)
- View request status

### ⚙️ Admin Side:
- View all service requests
- Update request status (PENDING → COMPLETED)
- Manage service workflow

---

## 🧱 Service Types Supported

- Electrician
- Plumber
- Carpenter
- Doctor
- Mechanic
- Cleaning Service

---

## 🔗 API Endpoints

| Method | Endpoint | Description |
|------|----------|-------------|
| POST | /api/request | Create new service request |
| GET | /api/requests | Get all requests |
| PUT | /api/request/{id}?status=COMPLETED | Update request status |

---

## 🧪 Sample JSON Request

{
  "userId": 101,
  "serviceType": "Electrician"
}

## 🚀 How to Run the Project

### 1️⃣ Backend (Spring Boot)
```bash
mvn spring-boot:run

Make sure MySQL is running and database is configured in:

application.properties
2️⃣ Frontend

Open the file:

index.html

OR

admin.html

in any browser.

📂 Project Structure
Emergency-Home-Service/
│
├── backend/
│   ├── src/main/java/com/emergency/emergency_services/
│   │   ├── controller/
│   │   ├── entity/
│   │   ├── repository/
│   │   └── EmergencyServicesApplication.java
│   └── resources/
│       └── application.properties
│
├── frontend/
│   ├── index.html
│   ├── admin.html
│   ├── app.js
│   └── style.css
│
└── README.md
🎯 Future Enhancements
User login & authentication
Real-time notifications
Payment gateway integration
Live service tracking (GPS)
Chat between user and service provider
👨‍💻 Author

Name: Ashutosh Pandey
Student Project – Full Stack Development (Spring Boot + Frontend Integration)

⭐ Output
Fully working REST API backend
Responsive frontend UI
Admin + User workflow system
Real-world emergency service simulation
