package com.zking.ssm.model;

public class TSysRoleTreenode {
    private Long rrid;

    private Long roleId;

    private Long treeNodeId;

    public TSysRoleTreenode(Long rrid, Long roleId, Long treeNodeId) {
        this.rrid = rrid;
        this.roleId = roleId;
        this.treeNodeId = treeNodeId;
    }

    public TSysRoleTreenode() {
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

    public Long getTreeNodeId() {
        return treeNodeId;
    }

    public void setTreeNodeId(Long treeNodeId) {
        this.treeNodeId = treeNodeId;
    }
}