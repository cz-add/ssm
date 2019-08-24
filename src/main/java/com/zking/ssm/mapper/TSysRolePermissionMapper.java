package com.zking.ssm.mapper;

import com.zking.ssm.model.TSysRolePermission;

public interface TSysRolePermissionMapper {
    int deleteByPrimaryKey(Long rrid);

    int insert(TSysRolePermission record);

    int insertSelective(TSysRolePermission record);

    TSysRolePermission selectByPrimaryKey(Long rrid);

    int updateByPrimaryKeySelective(TSysRolePermission record);

    int updateByPrimaryKey(TSysRolePermission record);
}