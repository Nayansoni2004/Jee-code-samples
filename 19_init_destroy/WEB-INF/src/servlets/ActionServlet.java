package servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void init() throws ServletException {
        System.out.println("........................");
        System.out.println("........................");
        System.out.println("........................");
        System.out.println("........................");
        System.out.println("Init Demonstration ...");
        System.out.println("........................");
        System.out.println("........................");
        System.out.println("........................");
        System.out.println("........................");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("Init Destroy Demonstration ...");
    }

    public void destroy() {
        System.out.println("........................");
        System.out.println("........................");
        System.out.println("........................");
        System.out.println("........................");
        System.out.println("Destroy Demonstration ...");
        System.out.println("........................");
        System.out.println("........................");
        System.out.println("........................");
        System.out.println("........................");
    }
}