# 🧑‍💼 Employee Timesheet & Task Management System

A real-time, enterprise-level **Spring Boot** application to manage employees, projects, tasks, timesheets, and leave records. Built using Java 21 and MySQL with clean layered architecture and RESTful APIs.

---

## 🚀 Tech Stack

| Layer            | Technology                     |
|------------------|--------------------------------|
| Language         | Java 21                        |
| Framework        | Spring Boot 3.x                |
| Database         | MySQL                          |
| ORM              | Spring Data JPA (Hibernate)    |
| Build Tool       | Maven                          |
| Web Layer        | Spring Web (REST APIs)         |
| Error Handling   | Custom Exceptions + Controller Advice |
| Logging          | SLF4J + Logback                |
| JSON Processing  | Jackson                        |
| Documentation    | Swagger (Optional)             |
| Scheduler (Opt.) | Spring Scheduler               |

---

## 📁 Project Structure
````
com.shreya.timesheet
├── controller
├── model
├── repository
├── service
│ └── impl
├── exception
├── configuration
└── EmployeeTimesheetTaskManagementApplication.java

````


---

## 🗃️ Modules

- **Employee Module**: Create, update, delete, fetch employees.
- **Project Module**: Assign and manage projects.
- **Task Module**: Assign tasks to employees under projects.
- **Timesheet Module**: Log work hours per task/project.
- **Leave Module**: Apply for and manage employee leaves.

---

## ⚙️ application.properties

```properties
# Server
server.port=8080

# MySQL Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/employee
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Jackson Date Format
spring.jackson.date-format=yyyy-MM-dd
spring.jackson.time-zone=UTC

```
Shreya Mahalle 

[GitHub](https://github.com/shreyamahalle) | [LinkedIn](https://linkedin.com/in/shreyamahalle)

