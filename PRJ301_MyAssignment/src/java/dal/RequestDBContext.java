/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import dal.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Request;

/**
 *
 * @author leeng
 */
public class RequestDBContext extends DBContext {
    
    public ArrayList<Request> getRequests(String username) {
        ArrayList<Request> requests = new ArrayList<>();
        try {
            String sql = "SELECT rid ,[content],[from],[to],[createdby]\n"
                    + "FROM [Request] \n"
                    + "WHERE createdby = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Request r = new Request();
                r.setRid(rs.getInt("rid"));
                r.setContent(rs.getString("content"));
                r.setFrom(rs.getDate("from"));
                r.setTo(rs.getDate("to"));
                Account account = new Account();
                account.setUsername(rs.getString("createdby"));
                r.setCreatedby(account);
                requests.add(r);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(RequestDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return requests;
    }
}
