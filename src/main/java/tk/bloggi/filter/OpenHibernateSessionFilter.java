package tk.bloggi.filter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import tk.bloggi.util.Attribute;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by happy on 21/09/2014.
 */

@WebFilter(filterName = "hibernateSessionFilter", urlPatterns = "/*")
public class OpenHibernateSessionFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        SessionFactory sessionFactory = getSessionFactoryFromRequest(request);
//        Session session = sessionFactory.openSession();

        chain.doFilter(request, response);

//        session.close();
    }

    @Override
    public void destroy() {}

    private SessionFactory getSessionFactoryFromRequest(ServletRequest request) {
        return (SessionFactory)request.getServletContext().getAttribute(Attribute.SESSION_FACTORY.getAttributeName());
    }
}
