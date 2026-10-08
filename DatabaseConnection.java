package com.employee.database;
import java.sql.*;
public class DatabaseConnection {
    private static final String URL="jdbc:mysql://localhost:3306/employee_management?useSSL=false&serverTimezone=UTC";
    private static final String USER="root";
    private static final String PASSWORD="root";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
