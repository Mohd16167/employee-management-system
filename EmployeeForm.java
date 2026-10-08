package com.employee.gui;
import com.employee.dao.EmployeeDAO;import com.employee.model.Employee;
import javax.swing.*;import java.awt.*;
public class EmployeeForm extends JDialog {
    JTextField[] f={new JTextField(),new JTextField(),new JTextField(),new JTextField(),new JTextField(),new JTextField()};
    String[] labels={"Name","Email","Phone","Department","Position","Salary"};
    public EmployeeForm(Dashboard d){super(d,"Add Employee",true);setSize(430,380);setLocationRelativeTo(d);JPanel p=new JPanel(new GridLayout(7,2,8,8));p.setBorder(BorderFactory.createEmptyBorder(20,25,20,25));
        for(int i=0;i<6;i++){p.add(new JLabel(labels[i]));p.add(f[i]);}JButton save=new JButton("Save");save.addActionListener(e->save(d));p.add(new JLabel());p.add(save);add(p);}
    void save(Dashboard d){try{Employee e=new Employee(f[0].getText(),f[1].getText(),f[2].getText(),f[3].getText(),f[4].getText(),Double.parseDouble(f[5].getText()));new EmployeeDAO().add(e);d.load();dispose();}catch(Exception e){JOptionPane.showMessageDialog(this,"Enter valid details: "+e.getMessage());}}
}
