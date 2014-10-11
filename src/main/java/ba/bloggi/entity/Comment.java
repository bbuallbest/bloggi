package ba.bloggi.entity;

import javax.persistence.*;

/**
 * Created by happy on 29/09/2014.
 */

@Entity
@Table(name = "comments")
@AttributeOverride(name = "id", column=@Column(name="id_comment"))
public class Comment extends GeneralEntity {

    @Column(name = "text_body")
    private String textBody;

    @ManyToOne
    @JoinColumn(name = "fk_post_id")
    private Post parentPost;

    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    private User commentAuthor;

    public Comment() {}

    public String getTextBody() {
        return textBody;
    }

    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }

    public Post getParentPost() {
        return parentPost;
    }

    public void setParentPost(Post parentPost) {
        this.parentPost = parentPost;
    }

    public User getCommentAuthor() {
        return commentAuthor;
    }

    public void setCommentAuthor(User commentAuthor) {
        this.commentAuthor = commentAuthor;
    }
}
