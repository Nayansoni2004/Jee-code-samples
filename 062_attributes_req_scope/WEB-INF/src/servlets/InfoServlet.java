package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.annotation.WebServlet;

import javax.servlet.ServletException;

import java.io.IOException;

@WebServlet("/info.do")
public class InfoServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("Info Servlet -----------------Ex062-------------------");

        Integer count = (Integer)request.getAttribute("count");
        System.out.println("Info Servlet ------------Ex062-----------" + count);

        request.getRequestDispatcher("index.html").forward(request, response);
    }
}