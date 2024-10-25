package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;

@WebServlet("/form.do")
public class FormServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userName = request.getParameter("unm");
        String email = request.getParameter("uem");
        String college = request.getParameter("ucg");
        String contact = request.getParameter("uct");

        System.out.println(userName);
        System.out.println(email);
        System.out.println(college);
        System.out.println(contact);

        response.addCookie(new Cookie("user_name", userName));
        response.addCookie(new Cookie("email", email));
        response.addCookie(new Cookie("college", college));
        response.addCookie(new Cookie("contact", contact));

        request.getRequestDispatcher("index.html").forward(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Cookie[] cookies = request.getCookies();

        String userName = "";
        String email = "";
        String college = "";
        String contact = "";

        if(cookies != null) {
            for(Cookie cookie : cookies) {
                String cookieName = cookie.getName();
                String cookieValue = cookie.getValue();

                if(cookieName.equals("user_name")) {
                    userName = cookieValue;
                } else if(cookieName.equals("email")) {
                    email = cookieValue;
                } else if(cookieName.equals("college")) {
                    college = cookieValue;
                } else if(cookieName.equals("contact")) {
                    contact = cookieValue;
                }
            }
        }

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<!DOCTYPE html>");
        pw.write("<html lang=\"en\">");
        pw.write("<head>");
        pw.write("<meta charset=\"UTF-8\">");
        pw.write("<meta name=\"viewport\"content=\"width=device-width, initial-scale=1.0\">");
        pw.write("<title>Document</title>");
        pw.write("</head>");
        pw.write("<body>");
        pw.write("<h1>Form Page</h1>");
        pw.write("<hr>");
        pw.write("<form action='form.do' method='post'>");
        pw.write("User Name: <input type='text' name='unm' value='" + userName + "'><br><br>");
        pw.write("Email: <input type='text' name='uem' value='" + email + "'><br><br>");
        pw.write("College: <input type='text' name='ucg' value='" + college + "'><br><br>");
        pw.write("Contact: <input type='text' name='uct' value='" + contact + "'><br><br>");
        pw.write("<input type='submit' value='Save'>");
        pw.write("</form>");
        pw.write("</body>");
        pw.write("</html>");

        pw.flush();
        pw.close();
    }
}