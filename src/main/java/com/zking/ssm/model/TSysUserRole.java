package com.zking.ssm.model;

public class TSysUserRole {
    private Long urid;

    private Long userId;

    private Long roleId;

    public TSysUserRole(Long urid, Long userId, Long roleId) {
        this.urid = urid;
        this.userId = userId;
        this.roleId = roleId;
    }

    public TSysUserRole() {
        super();
    }

    public Long getUrid() {
        return urid;
    }

    public void setUrid(Long urid) {
        this.urid = urid;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}