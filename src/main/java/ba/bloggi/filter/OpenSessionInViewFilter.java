package ba.bloggi.filter;

import ba.bloggi.util.DataBaseContextHolder;
import ba.bloggi.util.HibernateUtil;
import org.hibernate.Session;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by happy on 26/09/2014.
 */

@WebFilter(urlPatterns = "/*")
public class OpenSessionInViewFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        openSession();

        chain.doFilter(request, response);

        closeSession();
    }

    @Override
    public void destroy() {}
    
    private void closeSession() {
        DataBaseContextHolder.getSession().close();
        DataBaseContextHolder.clearContext();
    }

    private void openSession() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        DataBaseContextHolder.setSession(session);
    }
}
