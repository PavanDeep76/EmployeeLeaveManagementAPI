# Employee Leave Management API

A Spring Boot REST API application for managing employee leave requests efficiently.
This project demonstrates backend development concepts including CRUD operations, layered architecture, validation, exception handling, MySQL integration, and Swagger API documentation.

---

## Features

* Apply leave requests
* Fetch all leave requests
* Update leave request status
* Delete leave requests
* Input validation
* Global exception handling
* Swagger/OpenAPI documentation
* MySQL database integration
* RESTful API architecture

---

## Tech Stack

### Backend

* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate

### Database

* MySQL

### API Testing & Documentation

* Thunder Client / Postman
* Swagger UI

### Build Tool

* Maven

---

## Project Structure

```plaintext
src/main/java/com/pavandeep/leave_management
│
├── controller
├── service
├── repository
├── model
├── exception
└── LeaveManagementApplication.java
```

---

## API Endpoints

| Method | Endpoint                                    | Description              |
| ------ | ------------------------------------------- | ------------------------ |
| POST   | `/leave/apply`                              | Create leave request     |
| GET    | `/leave/all`                                | Fetch all leave requests |
| PUT    | `/leave/update-status/{id}?status=Approved` | Update leave status      |
| DELETE | `/leave/{id}`                               | Delete leave request     |

---

## Swagger Documentation

Access Swagger UI:

```plaintext
http://localhost:8080/swagger-ui/index.html
```

---

## Database Configuration

Update the following in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/leave_management
spring.datasource.username=root
spring.datasource.password=your_password
```

---

## Run the Project

```bash
mvn spring-boot:run
```

---

## Future Enhancements

* JWT Authentication
* Role-Based Access Control
* Email Notifications
* Leave Approval Workflow
* Docker Deployment

---

## Developed By

**Pavan Deep Pedamarla**

* GitHub: https://github.com/PavanDeep76
* LinkedIn: https://www.linkedin.com/in/pavan-deep-pedamarla
