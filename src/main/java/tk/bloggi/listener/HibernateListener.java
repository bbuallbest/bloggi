package tk.bloggi.listener; /**
 * Created by happy on 23/09/2014.
 */

import org.hibernate.SessionFactory;
import tk.bloggi.util.HibernateUtil;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class HibernateListener implements ServletContextListener {

    private SessionFactory sessionFactory;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        if (sessionFactory != null)
            sessionFactory.close();
    }
}
