package ba.bloggi.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by happy on 27/09/2014.
 */

public interface GenericDAO<T extends Serializable> {

    Serializable save(T value);

    T findById(Serializable id);

    List<T> findAll();

    T update(T value);

    T delete(T value);
}
