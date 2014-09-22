package tk.bloggi.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.w3c.dom.Attr;
import tk.bloggi.dao.OwnerDAO;
import tk.bloggi.persistence.entity.Owner;
import tk.bloggi.util.Attribute;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by happy on 21/09/2014.
 */

@WebServlet(name = "addOwner", urlPatterns = "/owner/add")
public class AddOwnerController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean trState = true, sessionState = true;

        SessionFactory sessionFactory = (SessionFactory)req.getServletContext().getAttribute(Attribute.SESSION_FACTORY.getAttributeName());
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = null;
        if(session != null) {
            tr = session.beginTransaction();
            trState = false;

            OwnerDAO ownerDAO = new OwnerDAO(session);
            ownerDAO.save(new Owner("aa@aa.aa", "aa"));
        }

        if(tr != null) {
            tr.commit();
            sessionState = false;
        }

        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.println("<html><head></head><body>");
        pw.println("<h1>Is session null?</h1>");
        pw.println("<h4>" + sessionState + "</h4>");
        pw.println("<br/>");
        pw.println("<h1>Is transaction null?</h1>");
        pw.println("<h4>" + trState + "</h4>");
        pw.println("<br/>");
        pw.println("Session = " + session.getClass().toString());
        pw.println("</body></html>");

    }
}
