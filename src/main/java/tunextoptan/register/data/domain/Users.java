package tunextoptan.register.data.domain;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "users")
public class Users {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "seq_toptan_user", allocationSize = 1)
    @GeneratedValue(generator = "seq_toptan_user", strategy = GenerationType.SEQUENCE)
    Integer userId;
    @Column(name = "username")
    String userName;
    @Column(name = "userpass")
    String userPass;
    @Column(name = "usertc")
    String userTc;
    @Column(name = "useremail")
    String userEmail;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;
}
