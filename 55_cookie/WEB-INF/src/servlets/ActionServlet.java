package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        System.out.println(session.getId());

        Cookie c1 = new Cookie("name", "om");
        Cookie c2 = new Cookie("age", "12");
        Cookie c3 = new Cookie("school", "Phoenix");
        Cookie c4 = new Cookie("standard", "7th");

        request.getRequestDispatcher("next.html").forward(request, response);
    }
}