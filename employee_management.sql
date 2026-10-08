CREATE DATABASE IF NOT EXISTS employee_management;
USE employee_management;

CREATE TABLE IF NOT EXISTS employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(120) NOT NULL,
    phone VARCHAR(20),
    department VARCHAR(80),
    position VARCHAR(80),
    salary DECIMAL(10,2)
);

INSERT INTO employees(name,email,phone,department,position,salary) VALUES
('John Doe','john@example.com','0700000000','IT','Software Developer',45000.00),
('Sarah Ali','sarah@example.com','0711111111','HR','HR Assistant',35000.00);
