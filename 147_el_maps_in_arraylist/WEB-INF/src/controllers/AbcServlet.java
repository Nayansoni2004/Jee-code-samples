package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import java.io.IOException;

import models.User;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

@WebServlet("/abc.do")
public class AbcServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        User u1 = new User("balveer", 34);
        User u2 = new User("ranveer", 35);
        User u3 = new User("shukhbeer", 36);
        User u4 = new User("baalveer", 23);

        Map<String, User> recs1 = new HashMap<>();
        recs1.put("A1", u1);
        recs1.put("A2", u2);

        Map<String, User> recs2 = new HashMap<>();
        recs2.put("A1", u3);
        recs2.put("A2", u4);

        ArrayList<Map<String, User>> records = new ArrayList<>();
        records.add(recs1);
        records.add(recs2);

        request.setAttribute("pqr", records);

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}