package com.zking.ssm.service;

import com.zking.ssm.model.TSysRole;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class IRoleServiceTest extends BaseTestCase {
    @Autowired
    private  IRoleService roleService;
    private TSysRole tSysRole;
    @Before
    public void setUp()  {
        tSysRole=new TSysRole();
    }

    @Test
    public void add() throws Exception {
        tSysRole.setRoleName("manager");
        tSysRole.setAvailable(1);
        tSysRole.setDescription("经理");
        int add = roleService.add(tSysRole);
        System.out.println(add);
    }

    @Test
    public void del() throws Exception {
        tSysRole.setRoleId(3l);
        int del = roleService.del(tSysRole);
        System.out.println(del);
    }

    @Test
    public void doGrantRoleToUser() throws Exception {
    }

    @Test
    public void doRevokeRoleFromUser() throws Exception {
    }

    @Test
    public void doGrantPermissionToRole() throws Exception {
    }

    @Test
    public void doRevokePermissionFromRole() throws Exception {
    }

}