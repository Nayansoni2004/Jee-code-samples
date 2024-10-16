package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import java.io.IOException;

// import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

@WebServlet("/info.do")
public class InfoServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        String cookies = request.getHeader("cookie");

        System.out.println(cookies);

        request.getRequestDispatcher("index.html").forward(request, response);
    }
}