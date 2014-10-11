package ba.bloggi.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by happy on 21/09/2014.
 */

@Entity
@Table(name = "users")
@AttributeOverride(name = "id", column = @Column(name = "id_user"))
public class User extends GeneralEntity {

    @OneToMany(mappedBy = "postAuthor", cascade = CascadeType.ALL)
    private List<Post> posts = new LinkedList<>();

    @OneToMany(mappedBy = "commentAuthor", cascade = CascadeType.ALL)
    private List<Comment> comments = new LinkedList<>();

    private String email;
    private String password;

    public User() {}

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
