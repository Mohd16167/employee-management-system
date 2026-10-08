package com.employee.dao;
import com.employee.database.DatabaseConnection;
import com.employee.model.Employee;
import java.sql.*; import java.util.*;
public class EmployeeDAO {
    public void add(Employee e) throws SQLException {
        String q="INSERT INTO employees(name,email,phone,department,position,salary) VALUES(?,?,?,?,?,?)";
        try(Connection c=DatabaseConnection.getConnection(); PreparedStatement p=c.prepareStatement(q)){
            p.setString(1,e.getName());p.setString(2,e.getEmail());p.setString(3,e.getPhone());
            p.setString(4,e.getDepartment());p.setString(5,e.getPosition());p.setDouble(6,e.getSalary());p.executeUpdate();
        }
    }
    public List<Employee> getAll() throws SQLException {
        List<Employee> list=new ArrayList<>();
        try(Connection c=DatabaseConnection.getConnection(); PreparedStatement p=c.prepareStatement("SELECT * FROM employees ORDER BY id DESC"); ResultSet r=p.executeQuery()){
            while(r.next()) list.add(new Employee(r.getInt("id"),r.getString("name"),r.getString("email"),r.getString("phone"),r.getString("department"),r.getString("position"),r.getDouble("salary")));
        } return list;
    }
    public void delete(int id) throws SQLException {
        try(Connection c=DatabaseConnection.getConnection(); PreparedStatement p=c.prepareStatement("DELETE FROM employees WHERE id=?")){
            p.setInt(1,id);p.executeUpdate();
        }
    }
}
