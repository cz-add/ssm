package com.zking.ssm.mapper;

import com.zking.ssm.model.TSysUser;

public interface TSysUserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(TSysUser record);

    int insertSelective(TSysUser record);

    TSysUser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(TSysUser record);

    int updateByPrimaryKey(TSysUser record);

    TSysUser dolog(TSysUser record);

    int updatePassword(TSysUser record);

    TSysUser loadByUsername(TSysUser record);
}