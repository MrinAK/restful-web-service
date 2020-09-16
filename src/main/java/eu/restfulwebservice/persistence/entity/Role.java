package eu.restfulwebservice.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {

    private Integer roleId;

    private String roleName;

    private Instant dateCreated;

    private Instant dateModified;

    private Role(Integer roleId, String roleName, Instant dateCreated, Instant dateModified){
        this.roleId = roleId;
        this.roleName = roleName;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    protected Role() {
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Instant getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Instant dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Instant getDateModified() {
        return dateModified;
    }

    public void setDateModified(Instant dateModified) {
        this.dateModified = dateModified;
    }
}
