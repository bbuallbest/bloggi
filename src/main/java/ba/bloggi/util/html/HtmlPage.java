package ba.bloggi.util.html;

/**
 * Created by happy on 11/10/2014.
 */
public enum HtmlPage {
    SIGNIN("/static/html/sign/signin.html", "/signin"),
    SIGNUP("/static/html/sign/signup.html", "/signup"),
    PERSONAL("/static/html/personal/personal.html", "/blog");

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
