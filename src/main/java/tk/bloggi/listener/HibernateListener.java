package tk.bloggi.listener;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import tk.bloggi.util.Attribute;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by happy on 21/09/2014.
 */

@WebListener
public class HibernateListener implements ServletContextListener {

    private static final String XML_CONFIG_FILE_PATH = "/hibernate.cfg.xml";

    private SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();

        Configuration config = new Configuration();
        config.configure(XML_CONFIG_FILE_PATH);

        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        sessionFactory = config.buildSessionFactory(serviceRegistry);

        servletContext.setAttribute(Attribute.SESSION_FACTORY.getAttributeName(), sessionFactory);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        sessionFactory.close();
    }
}
