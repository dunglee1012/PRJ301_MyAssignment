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
import model.Request;

/**
 *
 * @author leeng
 */
public class RequestDBContext extends DBContext {

    public List<Request> getRequests(String username) {
        List<Request> request = new ArrayList<>();
        try {
            String sql = "select id,\n"
                    + "content,\n"
                    + "[from],\n"
                    + "[to],\n"
                    + "createdby\n"
                    + "from Request";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Request r = new Request();
                r.setId(rs.getInt("id"));
                r.setContent(rs.getString("content"));
                r.setFrom(rs.getDate("from"));
                r.setTo(rs.getDate("to"));
                Account account = new Account();
                account.setUsername(rs.getString("createdby"));
                r.setCreatedby(account);
                request.add(r);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return request;
    }

//    public static void main(String[] args) {
//        RequestDBContext db = new RequestDBContext();
//        List<Request> list = db.getRequests();
//        for (Request r : list) {
//            System.out.println(r);
//        }
//    }
}
