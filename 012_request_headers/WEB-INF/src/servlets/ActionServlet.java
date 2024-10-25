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

        pw.write("<h1>Request Headers: </h1>");
        pw.write("<h2>Host: " + request.getHeader("host") + "</h2>");
        pw.write("<h2>User Agent: " + request.getHeader("user-agent") + "</h2>");
        pw.write("<h2>Accept: " + request.getHeader("accept") + "</h2>");
        pw.write("<h2>Accept Language: " + request.getHeader("accept-language") + "</h2>");
        pw.write("<h2>Accept Encoding: " + request.getHeader("accept-encoding") + "</h2>");
        pw.write("<h2>Accept Charset: " + request.getHeader("accept-charset") + "</h2>");
        pw.write("<h2>Keep Alive: " + request.getHeader("keep-alive") + "</h2>");
        pw.write("<h2>Connection: " + request.getHeader("connection") + "</h2>");

        pw.flush();
        pw.close();
    }
}