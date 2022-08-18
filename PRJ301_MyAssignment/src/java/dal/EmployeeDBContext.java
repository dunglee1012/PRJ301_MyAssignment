/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Employee;

/**
 *
 * @author leeng
 */
public class EmployeeDBContext extends DBContext {

    public ArrayList<Employee> getEmployeesById(String username, String password,int id) {
        ArrayList<Employee> employee = new ArrayList<>();
        try {
            String sql = "select e.fullname,e.age,e.dob,e.telephone,e.title,e.assign,e.company from Employee e left join Account a \n"
                    + "on e.id = a.eid \n"
                    + "where a.username = ?\n"
                    + "and a.[password] = ?\n"
                    + "and a.id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1,username );
            stm.setString(2,password );
            stm.setInt(3,id );
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Employee e = new Employee();
                e.setFullname(rs.getString("fullname"));
                e.setAge(rs.getInt("age"));
                e.setDob(rs.getDate("dob"));
                e.setTelephone(rs.getInt("telephone"));
                e.setTitle(rs.getString("title"));
                e.setAssign(rs.getString("assign"));
                e.setCompany(rs.getString("company"));
                employee.add(e);
            }

        } catch (SQLException ex) {
            Logger.getLogger(QuestionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employee;
    }
    
//    public static void main(String[] args) {
//        EmployeeDBContext db = new EmployeeDBContext();
//        List<Employee> list = db.getEmployeesById("dung", "12345", 1);
//        System.out.println(list.get(0).getAge());
//    }
}
