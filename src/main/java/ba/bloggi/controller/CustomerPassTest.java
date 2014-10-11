package ba.bloggi.controller;

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
 * Created by happy on 29/09/2014.
 */

@WebServlet(urlPatterns = "/cust/pass")
public class CustomerPassTest extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session session = DataBaseContextHolder.getSession();
        Transaction transaction = session.beginTransaction();

//        Password password = new Password("myLittlePass");
//        Customer customer = new Customer(password);
//        password.setOwner(customer);
//
//        session.save(customer);

        transaction.commit();

        printAnswer(resp);
    }

    private void printAnswer(HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.println("<html><body><h2>Success!</h2></body></html>");
    }
}
