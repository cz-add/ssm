package com.zking.ssm.mapper;

import com.zking.ssm.model.TSysRole;

public interface TSysRoleMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(TSysRole record);

    int insertSelective(TSysRole record);

    TSysRole selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(TSysRole record);

    int updateByPrimaryKey(TSysRole record);
}