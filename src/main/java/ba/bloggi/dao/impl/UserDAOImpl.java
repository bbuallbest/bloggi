package ba.bloggi.dao.impl;

import ba.bloggi.dao.UserDAO;
import ba.bloggi.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

/**
 * Created by happy on 21/09/2014.
 */
public class UserDAOImpl implements UserDAO {

    private static final String SELECT_USER_BY_USERNAME = "FROM User u WHERE u.username = :username";
    private static final String SELECT_USER_BY_EMAIL = "FROM User u WHERE u.email = :email";

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
        Query query = session.createQuery(SELECT_USER_BY_EMAIL);
        query.setParameter("email", email);
        List<User> users = query.list();
        return users.get(0);
    }

    @Override
    public User findByUsername(String username) {
        Query query = session.createQuery(SELECT_USER_BY_USERNAME);
        query.setParameter("username", username);
        List<User> users = query.list();
        return users.get(0);
    }

    public void setSession(Session session) {
        this.session = session;
    }
}
