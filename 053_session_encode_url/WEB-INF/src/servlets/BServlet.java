package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/b.do")
public class BServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        String sessionId = session.getId();

        boolean isNew = session.isNew();

        System.out.println("BServlet*********SessionID: " + sessionId + " Is New: " + isNew);

       // request.getRequestDispatcher("info.html").forward(request, response);

       response.setContentType("text/html");

       PrintWriter pw = response.getWriter();

       pw.write("<!DOCTYPE html>");
       pw.write("<html lang='en'>");
       pw.write("<head>");
       pw.write("<meta charset='UTF-8'>"); 
       pw.write("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
       pw.write("<title>Document</title>");
       pw.write("</head>");
       pw.write("<body>");
       pw.write("<h1>Info Page</h1>");

       pw.write("<hr>");

       String encodedURL = response.encodeURL("c.do");
       pw.write("<a href='" + encodedURL + "'>CServlet Link</a>");
       pw.write("</body>");
       pw.write("</html>");

       pw.flush();
       pw.close();
    }
}