package ba.bloggi.entity;

import javax.persistence.*;

/**
 * Created by happy on 21/09/2014.
 */

@Entity
@Table(name = "owners")
public class Owner {

    @Id
    @Column(name = "id_owner")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;
    private String password;

    public Owner() {}

    public Owner(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
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
