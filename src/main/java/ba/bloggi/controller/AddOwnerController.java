package ba.bloggi.controller;

import ba.bloggi.dao.impl.UserDAOImpl;
import ba.bloggi.entity.User;
import ba.bloggi.util.DataBaseContextHolder;
import org.hibernate.Session;
import org.hibernate.Transaction;
//import ba.bloggi.util.Attribute;

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

        Session session = DataBaseContextHolder.getSession();

        Transaction tr = null;
        if(session != null) {
            tr = session.beginTransaction();
            trState = false;

            UserDAOImpl ownerDAO = new UserDAOImpl(session);
//            ownerDAO.save(new User("ccc@ccc.ccc", "ccc"));
        }

        if(tr != null) {
            tr.commit();
            sessionState = false;
        }

        PrintWriter pw = resp.getWriter();
        pw.println("<html><head></head><body>");
        pw.println("<h1>Is session null?</h1>");
        pw.println("<h4>" + sessionState + "</h4>");
        pw.println("<br/>");
        pw.println("<h1>Is transaction null?</h1>");
        pw.println("<h4>" + trState + "</h4>");
        pw.println("<br/>");

//        Session s = (Session)req.getServletContext().getAttribute(Attribute.SESSION.name());
//        if(s != null) {
//            pw.println("<b>prev.session == curr.session : " + (session == s) + "</b>");
//        }
//        else
            pw.println("<b>prev.session is NULL</b>");
        pw.println("<br/>");
        pw.println("<b>session = " + session + "</b>");
        pw.println("<br/>");
        pw.println("<b>session.getClass() = " + session.getClass() + "</b>");
        pw.println("<br/>");
        pw.println("<b>session.getClass().getClass() = " + session.getClass().getClass() + "</b>");
        pw.println("</body></html>");

//        req.getServletContext().setAttribute(Attribute.SESSION.name(), session);

        resp.setContentType("text/html");

    }
}
