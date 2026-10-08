package com.employee.gui;
import javax.swing.*; import java.awt.*;
public class LoginFrame extends JFrame {
    JTextField user=new JTextField(); JPasswordField pass=new JPasswordField();
    public LoginFrame(){
        setTitle("Employee Management System - Login");setSize(400,260);setLocationRelativeTo(null);setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel p=new JPanel(new GridLayout(5,1,8,8));p.setBorder(BorderFactory.createEmptyBorder(25,40,25,40));
        p.add(new JLabel("Username"));p.add(user);p.add(new JLabel("Password"));p.add(pass);
        JButton b=new JButton("Login"); b.addActionListener(e->{if(user.getText().equals("admin")&&new String(pass.getPassword()).equals("admin123")){dispose();new Dashboard().setVisible(true);}else JOptionPane.showMessageDialog(this,"Invalid login.");});
        p.add(b);add(p);
    }
}
