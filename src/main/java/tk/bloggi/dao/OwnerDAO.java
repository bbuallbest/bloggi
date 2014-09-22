package tk.bloggi.dao;

import org.hibernate.Session;
import tk.bloggi.persistence.entity.Owner;

/**
 * Created by happy on 21/09/2014.
 */
public class OwnerDAO {

    private Session session;

    public OwnerDAO() {}

    public OwnerDAO(Session session) {
        this.session = session;
    }

    public void save(Owner owner) {
        session.save(owner);
    }

    public void setSession(Session session) {
        this.session = session;
    }
}
