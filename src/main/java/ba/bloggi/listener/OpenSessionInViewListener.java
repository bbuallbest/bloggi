package ba.bloggi.listener; /**
 * Created by happy on 23/09/2014.
 */

import org.hibernate.Session;
import ba.bloggi.util.HibernateSessionContextHolder;
import ba.bloggi.util.HibernateUtil;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class OpenSessionInViewListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        HibernateSessionContextHolder.getSession().close();
        HibernateSessionContextHolder.setSession(null);
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        HibernateSessionContextHolder.setSession(session);
    }
}
