# Employee Management System

A Java Swing + MySQL employee management system for a BCA Phase-1 project.

## Technology Stack
Java | Java Swing | MySQL | JDBC | Maven

## Features
- Admin login
- Add employee
- View employee records
- Delete employee records
- MySQL database connectivity

## Login
Username: `admin`
Password: `admin123`

## Setup
1. Install JDK 17+, Maven and MySQL.
2. Run `database/employee_management.sql` in MySQL Workbench.
3. Open `src/main/java/com/employee/database/DatabaseConnection.java`.
4. Change the MySQL username/password if needed.
5. Open the project in IntelliJ IDEA, Eclipse or NetBeans.
6. Run `Main.java`.

## Repository Structure
```text
src/main/java/com/employee/
├── Main.java
├── database/DatabaseConnection.java
├── model/Employee.java
├── dao/EmployeeDAO.java
└── gui/
    ├── LoginFrame.java
    ├── Dashboard.java
    └── EmployeeForm.java

database/employee_management.sql
```

## Author
Mohez Jr - BCA, Graphic Era University
