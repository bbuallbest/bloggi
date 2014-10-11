package ba.bloggi.controller;

import ba.bloggi.dao.CommentDAO;
import ba.bloggi.dao.impl.CommentDAOImpl;
import ba.bloggi.entity.Comment;
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

/**
 * Created by happy on 29/09/2014.
 */

@WebServlet(urlPatterns = "/test")
public class TestController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user.setEmail("myEmail");
        user.setPassword("myPassword");

        Post post = new Post();
        post.setTextBody("This is my first post.");
        post.setTitle("ffPost");

        user.getPosts().add(post);
        post.setPostAuthor(user);

        Comment comment = new Comment();
        comment.setTextBody("AZAZAZAZa");

        user.getComments().add(comment);
        comment.setCommentAuthor(user);

        post.getComments().add(comment);
        comment.setParentPost(post);

        Session session = DataBaseContextHolder.getSession();
        Transaction transaction = session.beginTransaction();

//        UserDAO userDAO = new UserDAOImpl(session);
//        userDAO.save(user);
        CommentDAO commentDAO = new CommentDAOImpl(session);
        commentDAO.save(comment);

        transaction.commit();

        printAnswer(resp);

    }

    private void printAnswer(HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.println("<html><body><h2>Success!</h2></body></html>");
    }
}
