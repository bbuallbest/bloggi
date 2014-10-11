package ba.bloggi.controller;

import ba.bloggi.dao.PostDAO;
import ba.bloggi.dao.UserDAO;
import ba.bloggi.dao.impl.PostDAOImpl;
import ba.bloggi.dao.impl.UserDAOImpl;
import ba.bloggi.entity.Post;
import ba.bloggi.entity.User;
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
import java.util.HashSet;
import java.util.Set;

/**
 * Created by happy on 27/09/2014.
 */

@WebServlet(name = "userPost", urlPatterns = "/user/post")
public class UserPostTestController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session session = DataBaseContextHolder.getSession();
        Transaction transaction = session.beginTransaction();

//        User user = new User("user@gmail.com", "pass");
//        new UserDAOImpl(session).save(user);

        transaction.commit();

        transaction = session.beginTransaction();

//        User user2 = (User) session.get(User.class, user.getId());

////        Post p1 = new Post("body1", "title1", user2);
//        user2.getPosts().add(p1);
//
//        session.save(p1);


//        PostDAO postDAO = new PostDAOImpl(session);
//        postDAO.save(p1);
//        postDAO.save(p2);
//        postDAO.save(p3);

        transaction.commit();

        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.println("<html><body>Success!</body></html>");
    }
}
