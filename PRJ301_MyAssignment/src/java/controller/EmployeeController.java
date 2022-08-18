/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author leeng
 */
public class EmployeeController extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        int eid = Integer.parseInt(req.getParameter("eid"));
//        EmployeeDBContext db = new EmployeeDBContext();
//        ArrayList<Employee> employee = db.getEmployeesById(username, password, eid);
//        req.setAttribute("employee", employee);
//        req.getRequestDispatcher("view/employee.jsp").forward(req, resp);
    }
    
}
