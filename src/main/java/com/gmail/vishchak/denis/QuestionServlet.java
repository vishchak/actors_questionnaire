package com.gmail.vishchak.denis;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class QuestionServlet extends HttpServlet {

    static final String TEMPLATE = "<html>" +
            "<head><title>Vishchak</title></head>" +
            "<body><h1>Your answers:</h1><h2>%s</h2></body></html>";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String answerOne;
        String answerTwo;

        answerOne = req.getParameter("answer_one");
        if (answerOne.equals("Brad Pitt")) {
            answerOne += " is truly great!!!!!!";
        }
        answerTwo = req.getParameter("answer_two");

        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.println(String.format(TEMPLATE, answerOne + "<br>" + answerTwo));
    }
}
