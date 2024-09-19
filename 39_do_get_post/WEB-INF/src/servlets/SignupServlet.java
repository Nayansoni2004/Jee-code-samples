package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;

@WebServlet("/signup.do")
public class SignupServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userName = request.getParameter("nm");
        String email = request.getParameter("em");
        String password = request.getParameter("pw");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");

            String query = "insert into students (name, email, password) value (?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, userName);
            ps.setString(2, email);
            ps.setString(3, password);

            ps.executeUpdate();

            con.close();
        }
        catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("index.html").forward(request, response);
    }
}