/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dal.AccountDBContext;
import dal.QuestionDBContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import model.Question;

/**
 *
 * @author leeng
 */
public class FotgetPasswordController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        QuestionDBContext db = new QuestionDBContext();
        ArrayList<Question> questions = db.getQuestions();
        req.setAttribute("questions", questions);
        req.getRequestDispatcher("view/forget.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String answer = req.getParameter("answer");
        int qid = Integer.parseInt(req.getParameter("qid"));
        AccountDBContext db = new AccountDBContext();
        String password = db.getPassword(username, qid, answer);
        if (password != null) {
            resp.getWriter().println(password);
        } else {
            resp.getWriter().println("invalid question or answer or answer or username");
        }
    }
}
