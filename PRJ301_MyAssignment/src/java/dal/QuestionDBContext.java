/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Question;
import model.Request;

/**
 *
 * @author leeng
 */
public class QuestionDBContext extends DBContext {

    public ArrayList<Question> getQuestions() {
        ArrayList<Question> questions = new ArrayList<>();
        String sql = "select id, question from Question";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Question q = new Question();
                q.setId(rs.getInt("id"));
                q.setQuestion(rs.getString("question"));
                questions.add(q);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return questions;
    }
    public static void main(String[] args) {
        QuestionDBContext db = new QuestionDBContext();
        ArrayList<Question> list = db.getQuestions();
        for (Question r : list) {
            System.out.println(r);
        }
    }
}
