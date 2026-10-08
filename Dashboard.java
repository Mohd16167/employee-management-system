package com.employee.gui;
import com.employee.dao.EmployeeDAO; import com.employee.model.Employee;
import javax.swing.*; import javax.swing.table.DefaultTableModel; import java.awt.*;
public class Dashboard extends JFrame {
    DefaultTableModel model=new DefaultTableModel(new String[]{"ID","Name","Email","Phone","Department","Position","Salary"},0);
    JTable table=new JTable(model); EmployeeDAO dao=new EmployeeDAO();
    public Dashboard(){
        setTitle("Employee Management System");setSize(950,520);setLocationRelativeTo(null);setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton add=new JButton("Add Employee"),refresh=new JButton("Refresh"),del=new JButton("Delete Selected");
        add.addActionListener(e->new EmployeeForm(this).setVisible(true));refresh.addActionListener(e->load());del.addActionListener(e->delete());
        JPanel top=new JPanel();top.add(add);top.add(refresh);top.add(del);add(top,BorderLayout.NORTH);add(new JScrollPane(table));load();
    }
    void load(){model.setRowCount(0);try{for(Employee e:dao.getAll())model.addRow(new Object[]{e.getId(),e.getName(),e.getEmail(),e.getPhone(),e.getDepartment(),e.getPosition(),e.getSalary()});}catch(Exception e){JOptionPane.showMessageDialog(this,"Check MySQL settings.");}}
    void delete(){int r=table.getSelectedRow();if(r<0){JOptionPane.showMessageDialog(this,"Select an employee.");return;}try{dao.delete((int)model.getValueAt(r,0));load();}catch(Exception e){JOptionPane.showMessageDialog(this,e.getMessage());}}
}
