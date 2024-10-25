package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<h1>User Name: " + request.getParameter("uname") + "</h1>");
        pw.write("<h1>Password: " + request.getParameter("upass") + "</h1>");
        pw.write("<h1>Email: " + request.getParameter("ueml") + "</h1>");
        pw.write("<h1>College: " + request.getParameter("uclg") + "</h1>");
        pw.write("<h1>Address: " + request.getParameter("addr") + "</h1>");

        pw.flush();
        pw.close();
    }
}