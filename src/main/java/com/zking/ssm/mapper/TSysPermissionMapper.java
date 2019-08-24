package com.zking.ssm.mapper;

import com.zking.ssm.model.TSysPermission;

public interface TSysPermissionMapper {
    int deleteByPrimaryKey(Long permissionId);

    int insert(TSysPermission record);

    int insertSelective(TSysPermission record);

    TSysPermission selectByPrimaryKey(Long permissionId);

    int updateByPrimaryKeySelective(TSysPermission record);

    int updateByPrimaryKey(TSysPermission record);
}