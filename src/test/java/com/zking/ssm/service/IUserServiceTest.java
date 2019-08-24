package com.zking.ssm.service;

import com.zking.ssm.model.TSysUser;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class IUserServiceTest extends BaseTestCase {
    @Autowired
    private IUserService userService;
    private TSysUser tSysUser;

    @Override
    public void setUp()  {
        tSysUser=new TSysUser();
    }

    @Test
    public void doRegister() throws Exception {
        tSysUser.setUsername("邓小强");
        tSysUser.setPassword("1234567");
        tSysUser.setSalt("123");
        //时间戳转化为Sting或Date
        SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Long time=System.currentTimeMillis();
        String d = format.format(time);
        Date date=format.parse(d);
        tSysUser.setCreateDatetime(date);
        int i = userService.doRegister(tSysUser);
        System.out.println(i);
    }

    @Test
    public void doLogin() throws Exception {
        tSysUser.setUsername("邓小强");
        tSysUser.setPassword("1234567");
        TSysUser tSysUser = userService.doLogin(this.tSysUser);
        System.out.println(tSysUser);
    }

    @Test
    public void updatePassword() throws Exception {
        tSysUser.setUsername("邓小强");
        tSysUser.setPassword("qrewrwq");
        int i = userService.updatePassword(tSysUser);
        System.out.println(i);
    }

    @Test
    public void doResetPassword() throws Exception {
    }

    @Test
    public void loadByUsername() throws Exception {
        tSysUser.setUsername("邓小强");
        TSysUser tSysUser = userService.loadByUsername(this.tSysUser);
        System.out.println(tSysUser);
    }

    @Test
    public void listPermissionsByUserName() throws Exception {
    }

    @Test
    public void listRolesByUserName() throws Exception {
    }

}