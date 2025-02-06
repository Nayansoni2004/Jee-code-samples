import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.annotation.WebServlet;

import javax.servlet.ServletException;
import java.io.IOException;

@WebServlet("/act.do")
public class AServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("Hello ---  AServlet --- 291_error_handling...");

        int y = Integer.parseInt(request.getParameter("num"));
    }
}