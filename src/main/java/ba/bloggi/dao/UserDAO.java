package ba.bloggi.dao;

import ba.bloggi.entity.User;

/**
 * Created by happy on 27/09/2014.
 */
public interface UserDAO extends GenericDAO<User> {
    User findByEmail(String email);

    User findByUsername(String username);
}
