package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import java.io.IOException;
import javax.servlet.http.HttpSession;

@WebServlet("/c.do")
public class CServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        String sessionId = session.getId();

        System.out.println("CServlet ************SessionID: " + sessionId);

        request.getRequestDispatcher("next.html").forward(request, response);
    }
}