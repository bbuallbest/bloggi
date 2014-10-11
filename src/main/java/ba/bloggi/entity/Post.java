package ba.bloggi.entity;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by happy on 27/09/2014.
 */

@Entity
@Table(name = "posts")
@AttributeOverride(name = "id", column = @Column(name = "id_post"))
public class Post extends GeneralEntity {

    @Column(name = "text_body")
    private String textBody;

    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    private User postAuthor;

    @OneToMany(mappedBy = "parentPost", cascade = CascadeType.ALL)
    private List<Comment> comments;

    private String title;

    public Post() {
        comments = new LinkedList<>();
    }

    public String getTextBody() {
        return textBody;
    }

    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }

    public User getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(User postAuthor) {
        this.postAuthor = postAuthor;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
