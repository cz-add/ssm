package com.zking.ssm.model;

public class TSysRolePermission {
    private Long rrid;

    private Long roleId;

    private Long permissionId;

    public TSysRolePermission(Long rrid, Long roleId, Long permissionId) {
        this.rrid = rrid;
        this.roleId = roleId;
        this.permissionId = permissionId;
    }

    public TSysRolePermission() {
        super();
    }

    public Long getRrid() {
        return rrid;
    }

    public void setRrid(Long rrid) {
        this.rrid = rrid;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }
}