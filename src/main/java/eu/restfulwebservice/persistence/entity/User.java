package eu.restfulwebservice.persistence.entity;

import javax.persistence.*;
import java.time.Instant;

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

    private Instant dataCreated;

    private Instant dateModified;

    //    TODO
    private String password;


    private User(Long userId, String mail, String userUniqueId, Long roleId, String firstName,
                 String lastName, Instant dataCreated, Instant dateModified, String password) {
        this.userId = userId;
        this.mail = mail;
        this.userUniqueId = userUniqueId;
        this.roleId = roleId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dataCreated = dataCreated;
        this.dateModified = dateModified;
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

    public Instant getDataCreated() {
        return dataCreated;
    }

    public void setDataCreated(Instant dataCreated) {
        this.dataCreated = dataCreated;
    }

    public Instant getDateModified() {
        return dateModified;
    }

    public void setDateModified(Instant dateModified) {
        this.dateModified = dateModified;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public static User create(Long userId, String mail, String userUniqueId, Long roleId, String firstName,
                              String lastName, Instant dataCreated, Instant dateModified, String password) {

        return new User(userId, mail, userUniqueId, roleId, firstName,
                lastName, dataCreated, dateModified, password);
    }

    public void update(User newUser) {
        this.mail = newUser.mail;
        this.roleId = newUser.roleId;
        this.firstName = newUser.firstName;
        this.lastName = newUser.lastName;
        this.password = newUser.password;
    }
}
