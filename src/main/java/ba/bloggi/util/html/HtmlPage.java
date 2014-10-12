package ba.bloggi.util.html;

/**
 * Created by happy on 11/10/2014.
 */
public enum HtmlPage {
    SIGNIN("/static/html/sign/signin.html", "/signin"),
    SIGNUP("/static/html/sign/signup.html", "/signup"),
    BLOG_INDEX("/static/html/blog/blog-index.html", "/blog"),
    BLOG_POST("/static/html/blog/blog-post.html", "/post");

    private String path;
    private String uri;

    HtmlPage(String path, String uri) {
        this.path = path;
        this.uri = uri;
    }

    public String getUri() {
        return uri;
    }

    public String getPath() {
        return path;
    }
}
