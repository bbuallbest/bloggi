package ba.bloggi.dao.impl;

import ba.bloggi.dao.CommentDAO;
import ba.bloggi.entity.Comment;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

/**
 * Created by happy on 29/09/2014.
 */
public class CommentDAOImpl implements CommentDAO {

    private Session session;

    public CommentDAOImpl() {}

    public CommentDAOImpl(Session session) {
        this.session = session;
    }

    @Override
    public Serializable save(Comment value) {
        return (Serializable) session.save(value);
    }

    @Override
    public Comment findById(Serializable id) {
        return (Comment)session.get(Comment.class, id);
    }

    @Override
    public List<Comment> findAll() {
        return null;
    }

    @Override
    public Comment update(Comment value) {
        return null;
    }

    @Override
    public Comment delete(Comment value) {
        return null;
    }
}
