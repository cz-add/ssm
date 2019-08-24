package com.zking.ssm.mapper;

import com.zking.ssm.model.Oategory;

public interface OategoryMapper {
    int deleteByPrimaryKey(Integer categoryId);

    int insert(Oategory record);

    int insertSelective(Oategory record);

    Oategory selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(Oategory record);

    int updateByPrimaryKey(Oategory record);
}