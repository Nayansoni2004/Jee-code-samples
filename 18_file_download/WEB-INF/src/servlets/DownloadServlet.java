package servlets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;

@WebServlet("/download.do")
public class DownloadServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("application/pdf");

        OutputStream os = response.getOutputStream();

        ServletContext context = getServletContext();

        InputStream is = context.getResourceAsStream("/python.pdf");

        byte[] arr = new byte[256];
        int count = 0;
        while((count=is.read(arr)) != -1) {
            os.write(arr);
        }

        os.flush();
        os.close();
    }
}