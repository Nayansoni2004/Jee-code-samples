package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        boolean isNew = session.isNew();
        int maxInactiveInterval = session.getMaxInactiveInterval();

        System.out.println("maxInactiveInterval: " + maxInactiveInterval);
        System.out.println("Is New Session: " + isNew);

        request.getRequestDispatcher("index.html").forward(request, response);
    }
}