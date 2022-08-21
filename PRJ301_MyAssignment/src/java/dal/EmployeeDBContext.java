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

import model.Employee;

import model.Shift;

/**
 *
 * @author leeng
 */
public class EmployeeDBContext extends DBContext{
    public List<Employee> getEmployee() {
        List<Employee> emp = new ArrayList<>();
        try {
            String sql = "select fullname, age, [sid], telephone from Employee";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Employee e = new Employee();
                e.setFullname(rs.getString("fullname"));
                e.setAge(rs.getInt("age"));
                Shift shift = new Shift();
                shift.setId(rs.getInt("sid"));
                e.setShift(shift);
                e.setTelephone(rs.getInt("telephone"));
                emp.add(e);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return emp;
    }
    
    public List<Shift> getShifts() {
        List<Shift> list = new ArrayList<>();
        try {
            String sql = "select id, sname from [Shift]";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Shift s = new Shift();
                s.setId(rs.getInt("id"));
                s.setSname(rs.getString("sname"));
                list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
