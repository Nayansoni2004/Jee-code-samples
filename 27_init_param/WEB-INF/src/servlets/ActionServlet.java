package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

//import javax.servlet.ServletConfig;
//import javax.servlet.ServletContext;

public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String configAAA = getInitParameter("aaa");
        String contextAAA = getServletContext().getInitParameter("aaa");

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<h1>Config AAA: " + configAAA + "</h1>");
        pw.write("<h1>Context AAA: " + contextAAA + "</h1>");

        pw.flush();
        pw.close();
    }
}