package eu.restfulwebservice.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    private Integer userId;

    private String mail;

    private String userUniqueId;

    private Integer roleId;

    private String firstName;

    private String lastName;

    private Instant dataCreated;

    private Instant dateModified;

    private String password;

    private User(Integer userId, String mail, String userUniqueId,
                 Integer roleId, String firstName,
                 String lastName, Instant dataCreated,
                 Instant dateModified, String password) {
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

    protected User() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
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

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
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
}
