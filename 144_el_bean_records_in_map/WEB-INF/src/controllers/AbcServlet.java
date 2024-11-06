package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import java.io.IOException;

import java.util.Map;
import java.util.HashMap;

import models.User;

@WebServlet("/abc.do")
public class AbcServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        User u1 = new User("ranveer", 45);
        User u2 = new User("sukhbeer", 65);
        User u3 = new User("balveer", 72);

        Map<String, User> recs = new HashMap<>();

        recs.put("PaJi1", u1);
        recs.put("PaJi2", u2);
        recs.put("PaJi3", u3);

        request.setAttribute("pqr", recs);

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}