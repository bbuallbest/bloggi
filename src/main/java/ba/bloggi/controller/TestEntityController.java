package ba.bloggi.controller;

import ba.bloggi.entity.TestEntity;
import ba.bloggi.util.DataBaseContextHolder;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by happy on 09/10/2014.
 */

@WebServlet(urlPatterns = "/testentity")
public class TestEntityController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session session = DataBaseContextHolder.getSession();
        Transaction transaction = session.beginTransaction();

        TestEntity testEntity = new TestEntity("Dima", 25);
        String uuid = (String) session.save(testEntity);

        transaction.commit();

        printAnswer(resp, uuid);
    }

    private void printAnswer(HttpServletResponse resp, String uuid) throws IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.println("<html><body>");

        pw.println("<h2>Success!</h2>");
        pw.println("<br/>");
        pw.println("<h4>uuid = " + uuid + "</h4>");

        pw.println("</body></html>");
    }
}
