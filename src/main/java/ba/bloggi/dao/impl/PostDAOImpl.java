package ba.bloggi.dao.impl;

import ba.bloggi.dao.PostDAO;
import ba.bloggi.entity.Post;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

/**
 * Created by happy on 27/09/2014.
 */
public class PostDAOImpl implements PostDAO{

    private Session session;

    public PostDAOImpl() {}

    public PostDAOImpl(Session session) {
        this.session = session;
    }

    @Override
    public Serializable save(Post post) {
        return (Serializable) session.save(post);
    }

    @Override
    public Post findById(Serializable id) {
        return (Post) session.get(Post.class, id);
    }

    @Override
    public List<Post> findAll() {
        return null;
    }

    @Override
    public Post update(Post post) {
        return null;
    }

    @Override
    public Post delete(Post post) {
        return null;
    }
}
