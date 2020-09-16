package eu.restfulwebservice.service.dto;

import java.time.Instant;

public class RoleDTO {

    private Long id;

    private Integer roleId;

    private String roleName;

    private Instant dateCreated;

    private Instant dateModified;

    public RoleDTO(Long id, Integer roleId, String roleName, Instant dateCreated, Instant dateModified) {
        this.id = id;
        this.roleId = roleId;
        this.roleName = roleName;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public RoleDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
