package ba.bloggi.util;

import org.hibernate.Session;

/**
 * Created by happy on 23/09/2014.
 */
public class HibernateSessionContextHolder {
    private static final ThreadLocal<Session> threadLocalSession = new ThreadLocal<Session>();

    public final static Session getSession() {
        return threadLocalSession.get();
    }

    public  static final void setSession(Session session) {
        threadLocalSession.set(session);
    }
}
