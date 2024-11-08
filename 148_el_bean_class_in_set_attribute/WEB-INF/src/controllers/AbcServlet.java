package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import javax.servlet.http.HttpSession;

import java.io.IOException;

import models.User;

@WebServlet("/abc.do")
public class AbcServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        User user = new User();

        user.setName("Ranveer");
        user.setAge(21);

        session.setAttribute("pqr", user);

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}