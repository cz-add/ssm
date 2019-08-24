package com.zking.ssm.mapper;

import com.zking.ssm.model.TSysUserRole;

public interface TSysUserRoleMapper {
    int deleteByPrimaryKey(Long urid);

    int insert(TSysUserRole record);

    int insertSelective(TSysUserRole record);

    TSysUserRole selectByPrimaryKey(Long urid);

    int updateByPrimaryKeySelective(TSysUserRole record);

    int updateByPrimaryKey(TSysUserRole record);
}