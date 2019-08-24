package com.zking.ssm.mapper;

import com.zking.ssm.model.TSysRoleTreenode;

public interface TSysRoleTreenodeMapper {
    int deleteByPrimaryKey(Long rrid);

    int insert(TSysRoleTreenode record);

    int insertSelective(TSysRoleTreenode record);

    TSysRoleTreenode selectByPrimaryKey(Long rrid);

    int updateByPrimaryKeySelective(TSysRoleTreenode record);

    int updateByPrimaryKey(TSysRoleTreenode record);
}