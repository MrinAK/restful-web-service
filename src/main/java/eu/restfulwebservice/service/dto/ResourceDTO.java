package eu.restfulwebservice.service.dto;

public class ResourceDTO {

    private Long resourceId;

    private Long roleId;

    private String resourceName;

    public ResourceDTO(Long resourceId, Long roleId, String resourceName) {
        this.resourceId = resourceId;
        this.roleId = roleId;
        this.resourceName = resourceName;

    }

    public ResourceDTO(Long resourceId, String resourceName) {
        this.resourceId = resourceId;
        this.resourceName = resourceName;
    }

    public ResourceDTO(String resourceName) {
        this.resourceName = resourceName;
    }

    public ResourceDTO() {
    }

    public Long getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Long getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getResourceName() {
        return this.resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
}
