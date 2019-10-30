package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ValueServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String value = req.getParameter("value");

        if(value != null && !value.equals("")) {
            res.setStatus(HttpServletResponse.SC_OK);
            res.getWriter().println(Integer.parseInt(value) * 2);
        } else {
            res.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            res.getWriter().println(0);
        }
        res.setContentType("text/html;charset=UTF-8");
    }
}
