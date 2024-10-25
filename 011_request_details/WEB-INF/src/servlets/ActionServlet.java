package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<h1>Context Path: " + request.getContextPath() + "</h1>");
        pw.write("<h1>Http Method: " + request.getMethod() + "</h1>");
        pw.write("<h1>Path Info: " + request.getPathInfo() + "</h1>");
        pw.write("<h1>URI: " + request.getRequestURI() + "</h1>");
        pw.write("<h1>URL: " + request.getRequestURL() + "</h1>");
        pw.write("<h1>Action URL: " + request.getServletPath() + "</h1>");

        pw.flush();
        pw.close();
    }
}