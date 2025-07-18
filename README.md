# 📝 To-Do App API

A simple RESTful To-Do application built with **Spring Boot**, **Spring Security (JWT)**, and **MySQL**.  
It allows users to register, authenticate using JWT, and manage their personal to-do tasks.

---

## 🔧 Tech Stack

- Spring Boot 3.x
- Spring Security with JWT
- Spring Data JPA
- MySQL Database
- Swagger (OpenAPI 3)
---

## 📁 Features

- ✅ User Registration & Login
- 🔐 JWT-based Authentication
- ✍️ Create, View, and Delete To-Do Items (only for logged-in user)
- 📦 Secure REST APIs
- 📚 Swagger UI for API documentation

### 2. Configure MySQL Database

Create a MySQL database:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tododb
spring.datasource.username=name
spring.datasource.password=your_password
```

## 🔐 API Endpoints

### 🔓 Public (No Auth Required)

| Method | Endpoint             | Description       |
| ------ | -------------------- | ----------------- |
| POST   | `/api/auth/register` | Register new user |
| POST   | `/api/auth/login`    | Login & get JWT   |

### 🔐 Protected (Requires JWT)

| Method | Endpoint         | Description          |
| ------ | ---------------- | -------------------- |
| GET    | `/api/todo`      | Get all user’s todos |
| POST   | `/api/todo`      | Add new todo         |
| DELETE | `/api/todo/{id}` | Delete user’s todo   |

---
## 🧪 Testing with Swagger
Visit:
📍 `http://localhost:8080/swagger-ui/index.html`

### Authorization Steps:

1. First, login via `/api/auth/login`
2. Copy the JWT token from the response
3. Click `Authorize` button in Swagger
4. Enter:
   ```
   Bearer <your-token>
   ```
---

## ✅ Sample Request: Register

```json
POST /api/auth/register
{
  "username": "john",
  "password": "1234"
}
```

## ✅ Sample Request: Add To-Do

```json
POST /api/todo
{
  "task": "Buy groceries"
}
---

## 🧑‍💻 Author
**Naveen B.Tech. - CSE (AI)**
Connect with me on [LinkedIn]( linkedin.com/in/naveen-kumar-3b8b6a23b)

