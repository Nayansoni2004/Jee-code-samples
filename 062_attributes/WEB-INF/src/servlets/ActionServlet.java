package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.annotation.WebServlet;

import javax.servlet.ServletException;

import java.io.IOException;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("Action Servlet --------------Ex062------------------------");

        request.setAttribute("count", 900);

        request.getRequestDispatcher("next.html").forward(request, response);
    }
}