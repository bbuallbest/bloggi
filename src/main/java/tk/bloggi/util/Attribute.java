package tk.bloggi.util;

/**
 * Created by happy on 21/09/2014.
 */
public enum Attribute {

    SESSION("currentSession"),
    SESSION_FACTORY("sessionFactory");

    private String attributeName;

    Attribute(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getAttributeName() {
        return attributeName;
    }
}
