package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;

import java.io.IOException;
import java.util.Date;

@WebServlet("/c.do")
public class CServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        boolean sessionNayaHaiKya = session.isNew();
        Date sessionCreationTime = new Date(session.getCreationTime());
        Date sessionLastAccessedTime = new Date(session.getLastAccessedTime());

        System.out.println("CServlet*********isNew: " + sessionNayaHaiKya + " SessionCreation Time: " + sessionCreationTime + " SessionLastAccessed Time: " + sessionLastAccessedTime);
        
        request.getRequestDispatcher("next.html").forward(request, response);
    }
}