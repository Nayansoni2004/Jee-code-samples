package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;
import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ServletConfig conf = getServletConfig();
        ServletContext context = conf.getServletContext();

        String aaa = context.getInitParameter("aaa");

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<h1>" + aaa + "</h1>");

        pw.flush();
        pw.close();
    }
}