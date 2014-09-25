package ba.bloggi.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by happy on 23/09/2014.
 */
public class HibernateUtil {

    private static final String XML_CONFIG_FILE_PATH = "/hibernate.cfg.xml";

    private static final SessionFactory sessionFactory = configureSessionFactory();
    private static ServiceRegistry serviceRegistry;

    private static SessionFactory configureSessionFactory() {
        Configuration config = new Configuration();
        config.configure(XML_CONFIG_FILE_PATH);

        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();

        return config.buildSessionFactory(serviceRegistry);
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
