package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import java.io.IOException;

import javax.servlet.http.HttpSession;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        int maxInactiveInterval = session.getMaxInactiveInterval();

        System.out.println("maxInactiveInterval: " + maxInactiveInterval);

        request.getRequestDispatcher("index.html").forward(request, response);
    }
}