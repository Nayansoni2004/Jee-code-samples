package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import models.User;

@WebServlet("/signin.do")
public class SigninServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        request.getRequestDispatcher("signin.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        String nextPage = "signin.jsp";

        User user = new User(email, password);

        if(user.signinUser()) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);//<-key & value...

            nextPage = "dashboard.jsp";
        }

        request.getRequestDispatcher(nextPage).forward(request, response);
    }
}