package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException {

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        String gender = request.getParameter("gender");
        String food = request.getParameter("food");
        String city = request.getParameter("city");

        pw.write("<h1>Gender: " + gender + "</h1>");
        pw.write("<h1>Food: " + food + "</h1>");
        pw.write("<h1>City: " + city + "</h1>");

        pw.flush();
        pw.close();
    }
}