package ba.bloggi.util;

import org.hibernate.Session;

/**
 * Created by happy on 23/09/2014.
 */
public class DataBaseContextHolder {
    private static final ThreadLocal<Session> threadLocalSession = new ThreadLocal<Session>();

    public static Session getSession() {
        return threadLocalSession.get();
    }

    public static void setSession(Session session) {
        threadLocalSession.set(session);
    }

    public static void clearContext() {
        threadLocalSession.remove();
    }
}
