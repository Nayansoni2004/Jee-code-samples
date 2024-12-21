import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.IOException;

import javax.servlet.ServletOutputStream;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;

import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.annotation.WebServlet;
@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        URL url = new URL("https://www.iitk.ac.in/esc101/share/downloads/javanotes5.pdf"); //remote server pdf url...

        HttpURLConnection con = (HttpURLConnection)url.openConnection();

        con.setRequestMethod("GET");
        con.setDoOutput(true);

        con.connect();

        DataOutputStream dos = new DataOutputStream(con.getOutputStream());

        dos.flush();
        dos.close();

        int responseCode = con.getResponseCode();

        if(responseCode == HttpURLConnection.HTTP_OK) {
            InputStream is = con.getInputStream();

            response.setContentType("application/pdf");

            ServletOutputStream sos = response.getOutputStream();

            byte[] arr = new byte[512];
            while(is.read(arr) != -1) {// returns:the total number of bytes read into the buffer, or -1 if there is no more data because the end of the stream has been reached.
                sos.write(arr);
            }

            sos.flush();
            sos.close();
        }
    }
}