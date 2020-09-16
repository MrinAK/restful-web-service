package eu.restfulwebservice.service.dto;

import java.time.Instant;

public class ResourceDTO {

    private Long id;

    private Integer resourceId;

    private String roleId;

    private String resourceName;

    private Instant dateCreated;

    private Instant dateModified;

    public ResourceDTO(Long id, Integer resourceId, String roleId,
                       String resourceName, Instant dateCreated, Instant dateModified) {
        this.id = id;
        this.resourceId = resourceId;
        this.roleId = roleId;
        this.resourceName = resourceName;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public ResourceDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
