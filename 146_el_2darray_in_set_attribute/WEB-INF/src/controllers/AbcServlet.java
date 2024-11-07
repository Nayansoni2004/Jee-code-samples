package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import java.io.IOException;

@WebServlet("/abc.do")
public class AbcServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String[] ar1 = {"gagandeep", "harleen", "pawandeep"};
        String[] ar2 = {"ram", "siya", "lakshman"};

        String[][] arr = {ar1, ar2};

        request.setAttribute("pqr", arr);

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}