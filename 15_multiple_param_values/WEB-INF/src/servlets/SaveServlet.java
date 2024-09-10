package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        String gender = request.getParameter("gender");
        String[] foods = request.getParameterValues("food");
        String[] cities = request.getParameterValues("city");

        pw.write("<h1>Gender: " + gender + "</h1>");

        for(String food : foods)
            pw.write("<h1>Food: " + food + "</h1>");

        for(String city : cities)
            pw.write("<h1>City: " + city + "</h1>");

        pw.flush();
        pw.close();
    }
}