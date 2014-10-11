package ba.bloggi.filter;

import ba.bloggi.util.html.HtmlPage;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by happy on 11/10/2014.
 */

@WebFilter(urlPatterns = "/*")
public class HtmlFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)request;
        HttpServletResponse resp = (HttpServletResponse)response;

        redirectToHtmlPageIfHtmlWasRequested(req, resp, chain);
    }

    private void redirectToHtmlPageIfHtmlWasRequested(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        HtmlPage[] pages = HtmlPage.values();
        RequestDispatcher dispatcher = null;

        for (int i = 0; i < pages.length; i++) {
            if(pages[i].getUri().equals(requestURI))
                dispatcher = request.getRequestDispatcher(pages[i].getPath());
        }

        if (dispatcher == null)
            chain.doFilter(request, response);
        else
            dispatcher.forward(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}

    @Override
    public void destroy() {}
}
