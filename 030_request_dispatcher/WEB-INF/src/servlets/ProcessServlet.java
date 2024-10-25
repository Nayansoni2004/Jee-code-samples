package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;

@WebServlet("/pro.do")
public class ProcessServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        //response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<h1 style='color:green'>Inside Process Servlet ----------------</h1>");

        //request.getRequestDispatcher("pro.do").forward(request, response);
        pw.flush();
        pw.close();
    }
}