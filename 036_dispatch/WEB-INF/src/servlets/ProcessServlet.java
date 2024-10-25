package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import java.io.IOException;

@WebServlet("/pro.do")
public class ProcessServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("Process Servlet ***********POST*********" + request.getMethod());
        doGet(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userName = request.getParameter("nm");
        String email = request.getParameter("em");
        String password = request.getParameter("pw");

        System.out.println("Process Servlet *************GET***********start");
        System.out.println(userName + " - " + email + " - " + password);
        System.out.println("Process Servlet *************GET**********end");

        request.getRequestDispatcher("next.html").forward(request, response);
    }
}