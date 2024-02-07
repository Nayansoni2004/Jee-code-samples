import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.annotation.WebServlet;

import javax.servlet.ServletException;
import java.io.IOException;

@WebServlet("/act.do")
public class AServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("Hello --- AServlet --- 296_error_handling...");

        int i = Integer.parseInt(req.getParameter("num"));

        int[] x = {20, 25, 30};

        System.out.println(x[i]);
    }
}