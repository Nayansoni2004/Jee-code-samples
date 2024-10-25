package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;

public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ServletConfig conf = getServletConfig();

        String aaa = conf.getInitParameter("aaa");

        String nm = request.getParameter("nm");
        Integer ag = Integer.parseInt(request.getParameter("ag"));

        String accept = request.getHeader("accept");
        String acceptLanguage = request.getHeader("accept-language");

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<h1>" + aaa + "</h1>");

        pw.flush();
        pw.close();
    }
}