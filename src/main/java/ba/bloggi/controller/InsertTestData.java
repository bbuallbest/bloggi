package ba.bloggi.controller;

import ba.bloggi.dao.CommentDAO;
import ba.bloggi.dao.PostDAO;
import ba.bloggi.dao.UserDAO;
import ba.bloggi.dao.impl.CommentDAOImpl;
import ba.bloggi.dao.impl.PostDAOImpl;
import ba.bloggi.dao.impl.UserDAOImpl;
import ba.bloggi.entity.Comment;
import ba.bloggi.entity.Post;
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

@WebServlet(urlPatterns = "/test/data")
public class InsertTestData extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Session session = DataBaseContextHolder.getSession();
        Transaction tr = session.beginTransaction();

        UserDAO userDAO = new UserDAOImpl(session);
        PostDAO postDAO = new PostDAOImpl(session);
        CommentDAO commentDAO = new CommentDAOImpl(session);

        User[] users = new User[3];
        Post[] posts = new Post[3];
        Comment[] comments = new Comment[3];

        // create users
        for (int i = 0; i < users.length; i++) {
            users[i] = new User();
            users[i].setEmail("user" + i + "@mail.com");
            users[i].setPassword("pass" + i);
        }

        // create posts
        for (int i = 0; i < posts.length; i++) {
            posts[i] = new Post();
            posts[i].setPostAuthor(users[i]);
            users[i].getPosts().add(posts[i]);
            posts[i].setTitle("Title " + i);
            posts[i].setTextBody("Very cute post " + i);
        }

        // create comments
        for (int i = 0; i < comments.length; i++) {
            comments[i] = new Comment();
            comments[i].setTextBody("It's comment " + i);
            comments[i].setCommentAuthor(users[i]);
            users[i].getComments().add(comments[i]);
            comments[i].setParentPost(posts[i]);
            posts[i].getComments().add(comments[i]);
        }

        for (int i = 0; i < users.length; i++) {
            userDAO.save(users[i]);
        }

        tr.commit();

        printSuccessHtml(resp);
    }

    void printSuccessHtml(HttpServletResponse resp) throws IOException {
        PrintWriter pw = resp.getWriter();
        pw.println("<html><head></head><body>");
        pw.println("<b>Success!</b>");
        pw.println("</body></html>");
        resp.setContentType("text/html");

    }
}
