package com.zking.ssm.model;

public class TSysRole {
    private Long roleId;

    private String roleName;

    private Integer available;

    private String description;

    public TSysRole(Long roleId, String roleName, Integer available, String description) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.available = available;
        this.description = description;
    }

    public TSysRole() {
        super();
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}