import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.annotation.WebServlet;

import javax.servlet.ServletException;
import java.io.IOException;

@WebServlet("/act.do")
public class AServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("Hello --- AServlet -- 290_error_handling_at_application_scope_for_servlets...");

        int q = 5 / 0;
    }
}