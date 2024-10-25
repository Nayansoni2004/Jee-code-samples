package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class SaveServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        Enumeration<String> names = request.getParameterNames();

        while(names.hasMoreElements())
            pw.write("<h1>Param Name: " + names.nextElement() + "</h1>");

            pw.flush();
            pw.close();
    }
}