package ba.bloggi.dao.impl;

import ba.bloggi.dao.UserDAO;
import ba.bloggi.entity.User;
import org.hibernate.Session;

import javax.naming.OperationNotSupportedException;
import java.io.Serializable;
import java.util.List;

/**
 * Created by happy on 21/09/2014.
 */
public class UserDAOImpl implements UserDAO {

    private Session session;

    public UserDAOImpl() {}

    public UserDAOImpl(Session session) {
        this.session = session;
    }

    public Serializable save(User user) {
        return (Serializable)session.save(user);
    }

    @Override
    public User findById(Serializable id) {
        return (User) session.get(User.class, id);
    }

    @Override
    public List<User> findAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public User update(User user) {
        throw new UnsupportedOperationException();
    }

    @Override
    public User delete(User user) {
        throw new UnsupportedOperationException();
    }

    @Override
    public User findByEmail(String email) {
        throw new UnsupportedOperationException();
    }

    public void setSession(Session session) {
        this.session = session;
    }
}
