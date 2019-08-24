package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.TSysUserMapper;
import com.zking.ssm.model.TSysUser;
import com.zking.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class UserServiceImpl implements IUserService {
    public UserServiceImpl() {
    }
    @Autowired
    private TSysUserMapper tSysUserMapper;
    /**
     * //用户注册
     * @param tSysUser
     * @return
     */
    @Override
    public int doRegister(TSysUser tSysUser) {
        return tSysUserMapper.insert(tSysUser);
    }

    /**
     * //用户登陆
     * @param tSysUser
     * @return
     */
    @Override
    public TSysUser doLogin(TSysUser tSysUser) {
        return tSysUserMapper.dolog(tSysUser);
    }

    /**
     * 所有人都可以修改自己的密码
     * @param tSysUser
     * @return
     */
    @Override
    public int updatePassword(TSysUser tSysUser) {
        return tSysUserMapper.updatePassword(tSysUser);
    }

    /**
     * //管理员可以重置所有人的密码，密码默认值为888888
     * @param tSysUser
     * @return
     */
    @Override
    public int doResetPassword(TSysUser tSysUser) {
        return 0;
    }

    /**
     * //根据用户名查询用户
     * @param tSysUser
     * @return
     */
    @Override
    public TSysUser loadByUsername(TSysUser tSysUser) {
        return tSysUserMapper.loadByUsername(tSysUser);
    }

    /**
     * //查询指定用户拥有的权限
     * @param tSysUser
     * @return
     */
    @Override
    public Set<String> listPermissionsByUserName(TSysUser tSysUser) {
        return null;
    }

    /**
     * //查询指定用户拥有的角色
     * @param tSysUser
     * @return
     */
    @Override
    public Set<String> listRolesByUserName(TSysUser tSysUser) {
        return null;
    }
}
