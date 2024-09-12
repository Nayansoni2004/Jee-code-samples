package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/pro.do")
public class ProcessServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        //response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<h1 style='color:green'>Inside Process Servlet ###############</h1>");
    }
}