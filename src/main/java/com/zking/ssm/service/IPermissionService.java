package com.zking.ssm.service;


import com.zking.ssm.model.TSysPermission;

public interface IPermissionService {
    int add(TSysPermission tSysPermission);
    int del(TSysPermission tSysPermission);
}
