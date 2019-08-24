package com.zking.ssm.service;

import com.zking.ssm.model.TSysRole;

public interface IRoleService {
    int add(TSysRole tSysRole);
    int del(TSysRole tSysRole);

    //权限关键接口
    int doGrantRoleToUser(TSysRole tSysRole);//给用户分配角色
    int doRevokeRoleFromUser(TSysRole tSysRole);//从用户收回角色
    int doGrantPermissionToRole(TSysRole tSysRole);//给角色分配权限
    int doRevokePermissionFromRole(TSysRole tSysRole);//从角色收回权限
}
