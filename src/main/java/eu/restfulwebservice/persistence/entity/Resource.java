package eu.restfulwebservice.persistence.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "resources")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resourceId;

// todo
    private Long roleId;

    private String resourceName;

    @CreationTimestamp
    private Timestamp dataCreated;

    @UpdateTimestamp
    private Timestamp dataModified;

    private Resource(Long resourceId, Long roleId, String resourceName) {
        this.resourceId = resourceId;
        this.roleId = roleId;
        this.resourceName = resourceName;
    }

    protected Resource() {
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Timestamp getDataCreated() {
        return dataCreated;
    }

    public void setDataCreated(Timestamp dataCreated) {
        this.dataCreated = dataCreated;
    }

    public Timestamp getDataModified() {
        return dataModified;
    }

    public void setDataModified(Timestamp dataModified) {
        this.dataModified = dataModified;
    }

    public static Resource create(Long resourceId, Long roleId, String resourceName) {

        return new Resource(resourceId, roleId, resourceName);
    }

    public void update(Resource newResource) {
        this.resourceName = newResource.resourceName;

    }
}