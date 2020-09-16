package eu.restfulwebservice.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "resources")
public class Resource extends BaseEntity {

    private Integer resourceId;

    private String roleId;

    private String resourceName;

    private Instant dateCreated;

    private Instant dateModified;

    private Resource(Integer resourceId, String roleId, String resourceName, Instant dateCreated, Instant dateModified){
        this.resourceId = resourceId;
        this.roleId = roleId;
        this.resourceName = resourceName;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    protected Resource() {
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
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
