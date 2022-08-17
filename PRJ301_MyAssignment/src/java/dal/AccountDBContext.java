/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;

/**
 *
 * @author leeng
 */
public class AccountDBContext extends DBContext {

    public Account getAccount(String username, String password) {
        try {
            String sql = "select * from Account\n"
                    + "where username = ?\n"
                    + "and [password] = ?";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                Account account = new Account();
                account.setUsername(username);
                return account;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String getPassword(String username, int qid, int sid, String answer, int eid, int rid) {
        try {
            String sql = "select [password] from Account\n"
                    + "where username = ?\n"
                    + "and qid = ?\n"
                    + "and [sid] = ?\n"
                    + "and answer = ?\n"
                    + "and eid = ?\n"
                    + "and rid = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setInt(2, qid);
            stm.setInt(3, sid);
            stm.setString(4, answer);
            stm.setInt(5, eid);
            stm.setInt(6, rid);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return rs.getString("password");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
