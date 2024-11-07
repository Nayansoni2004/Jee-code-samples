package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/abc.do")
public class AbcServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String[] arr = {"Shukhbeer", "ranveer", "balveer"};

        request.setAttribute("pqr", arr);

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}