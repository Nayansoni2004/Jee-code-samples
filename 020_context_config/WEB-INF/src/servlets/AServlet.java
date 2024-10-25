package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

@WebServlet("/a.do")
public class AServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        ServletConfig conf = getServletConfig();

        ServletContext context = conf.getServletContext();

        pw.write("<h1>" + conf + "</h1>");
        pw.write("<h1>" + context + "</h1>");
        pw.write("<h1>" + request + "</h1>");
        pw.write("<h1>" + response + "</h1>");

        pw.flush();
        pw.close();
    }
}