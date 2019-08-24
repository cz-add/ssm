package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.TSysRoleMapper;
import com.zking.ssm.model.TSysRole;
import com.zking.ssm.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements IRoleService {
    public RoleServiceImpl() {
    }
    @Autowired
    private TSysRoleMapper tSysRoleMapper;
    @Override
    public int add(TSysRole tSysRole) {
        return tSysRoleMapper.insert(tSysRole);
    }

    @Override
    public int del(TSysRole tSysRole) {
        return tSysRoleMapper.deleteByPrimaryKey(tSysRole.getRoleId());
    }

    @Override
    public int doGrantRoleToUser(TSysRole tSysRole) {
        return 0;
    }

    @Override
    public int doRevokeRoleFromUser(TSysRole tSysRole) {
        return 0;
    }

    @Override
    public int doGrantPermissionToRole(TSysRole tSysRole) {
        return 0;
    }

    @Override
    public int doRevokePermissionFromRole(TSysRole tSysRole) {
        return 0;
    }
}
