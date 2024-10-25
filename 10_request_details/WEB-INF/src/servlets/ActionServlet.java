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

        pw.write("<h1>Local Address: " + request.getLocalAddr() + "</h1>");
        pw.write("<h1>Remote Address: " + request.getRemoteAddr() + "</h1>");

        pw.write("<h1>Remote PORT: " + request.getRemotePort() + "</h1>");
        pw.write("<h1>Local PORT: " + request.getLocalPort() + "</h1>");
        pw.write("<h1>Server PORT: " + request.getServerPort() + "</h1>");

        pw.write("<h1>Protocol: " +request.getProtocol() + "</h1>");
        pw.write("<h1>Scheme: " + request.getScheme() + "</h1>");
        pw.write("<h1>Server Name: " + request.getServerName() + "</h1>");
        pw.write("<h1>Secure: " + request.isSecure() + "</h1>");

        pw.flush();
        pw.close();
    }
}