package com.zking.ssm.mapper;

import com.zking.ssm.model.TSysTreenode;

public interface TSysTreenodeMapper {
    int deleteByPrimaryKey(Integer treeNodeId);

    int insert(TSysTreenode record);

    int insertSelective(TSysTreenode record);

    TSysTreenode selectByPrimaryKey(Integer treeNodeId);

    int updateByPrimaryKeySelective(TSysTreenode record);

    int updateByPrimaryKey(TSysTreenode record);
}