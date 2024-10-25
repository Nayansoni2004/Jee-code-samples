package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import javax.servlet.http.HttpSession;

import java.io.IOException;

import java.util.Date;

@WebServlet("/b.do")
public class BServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        boolean sessionNayaHaiKya = session.isNew();
        Date sessionCreationTime = new Date(session.getCreationTime());
        Date sessionLastAccessedTime = new Date(session.getLastAccessedTime());

        System.out.println("BServlet********isNew: " + sessionNayaHaiKya + " SessionCreation Time: " + sessionCreationTime + " SessionLastAccessed Time: " + sessionLastAccessedTime);
        session.setMaxInactiveInterval(30);

        request.getRequestDispatcher("info.html").forward(request, response);
    }
}