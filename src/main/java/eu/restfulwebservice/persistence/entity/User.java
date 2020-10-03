package eu.restfulwebservice.persistence.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String mail;

    private String userUniqueId;

    private Long roleId;

    private String firstName;

    private String lastName;

    @CreationTimestamp
    private Timestamp dataCreated;

    @UpdateTimestamp
    private Timestamp dateModified;

    private String password;


    private User(Long userId, String mail, String userUniqueId, Long roleId, String firstName,
                 String lastName, String password) {
        this.userId = userId;
        this.mail = mail;
        this.userUniqueId = userUniqueId;
        this.roleId = roleId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public User(String mail, Long roleId, String firstName, String lastName, String password) {
        this.mail = mail;
        this.roleId = roleId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    protected User() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUserUniqueId() {
        return userUniqueId;
    }

    public void setUserUniqueId(String userUniqueId) {
        this.userUniqueId = userUniqueId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Timestamp getDataCreated() {
        return dataCreated;
    }

    public void setDataCreated(Timestamp dataCreated) {
        this.dataCreated = dataCreated;
    }

    public Timestamp getDateModified() {
        return dateModified;
    }

    public void setDateModified(Timestamp dateModified) {
        this.dateModified = dateModified;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public static User create(Long userId, String mail, String userUniqueId, Long roleId, String firstName,
                              String lastName, String password) {

        return new User(userId, mail, userUniqueId, roleId, firstName,
                lastName, password);
    }

    public void update(User newUser) {
        this.mail = newUser.mail;
        this.roleId = newUser.roleId;
        this.firstName = newUser.firstName;
        this.lastName = newUser.lastName;
        this.password = newUser.password;
    }
}
