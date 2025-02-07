*Student Management Application*

# Overview
The Student Management Application is a web-based system built with Spring Boot (backend) and MySQL (database). It allows users to manage student records, including adding, searching, and deleting students.

# Features
Add Student: Register a new student with details like name, age, class, and phone number.
Get All Student: finad all student at once.
Search Student: Find students by their name.
Update Student: Update any student on the go.
Delete Student: Remove a student from the system.
RESTful API: Uses Spring Boot to handle HTTP requests and interact with MySQL.

# Technologies Used
Backend: Spring Boot, Spring Data JPA
Database: MySQL

Frontend: React (Upcoming)

# Database Schema (MySQL)
Run the following SQL script to create the required database schema:

CREATE DATABASE student_db;
USE student_db;
CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    student_class VARCHAR(50) NOT NULL,
    phone_number VARCHAR(15) NOT NULL
);

# Setup Instructions

1. Clone the Repository
Download and Extract the Zip.
cd StudentManagementApplication

2. Configure MySQL Database
Update application.properties in src/main/resources/:

spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3. Run the Backend
mvn spring-boot:run

The backend will start at http://localhost:8080/.

4. API Endpoints
   
GET: /api/students/all
Get all students

GET: /api/students/search?name={name}
Search student by name

POST: /api/students/admission
Add a new student

PUT: /api/students/update?id={id}
Update a new student

DELETE: /api/students/delete?id={id}
Delete a student

# Upcoming Features
React Frontend
Authentication & Authorization

# Contribution
Feel free to fork this repository, raise issues, or submit pull requests to improve the application.

# License
This project is open-source and available under the MIT License.
