package hibernate.entities;


import javax.persistence.*;

/**
 * Created by Dell on 20.11.2015.
 */

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String username;

    @Column
    private String password;

    public void setID(int id) { this.id = id; }

    public void setUsername(String username) { this.username = username; }

    public void setPassword(String password) { this.password = password; }

    public int getId() { return id; }

    public String getUsername() { return username; }

    public String getPassword() { return password; }

}
