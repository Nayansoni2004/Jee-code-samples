package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

@WebServlet("/abc.do")
public class AbcServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Map<String, Integer> records = new HashMap<>();

        records.put("aaa", 100);
        records.put("bbb", 200);
        records.put("ccc", 300);

        request.setAttribute("pqr", records);

        request.getRequestDispatcher("next.jsp").forward(request, response); 
    }
}