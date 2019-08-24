package com.zking.ssm.service;

import com.zking.ssm.model.TSysUser;

import java.util.List;
import java.util.Set;

public interface IUserService {
    int doRegister(TSysUser tSysUser);//用户注册

    TSysUser doLogin(TSysUser tSysUser);//用户登陆

    int updatePassword(TSysUser tSysUser);//所有人都可以修改自己的密码

    int doResetPassword(TSysUser tSysUser);//管理员可以重置所有人的密码，密码默认值为888888

    //权限关键接口
    TSysUser loadByUsername(TSysUser tSysUser);//根据用户名查询用户
    Set<String> listPermissionsByUserName(TSysUser tSysUser);//查询指定用户拥有的权限
    Set<String> listRolesByUserName(TSysUser tSysUser);//查询指定用户拥有的角色
}
