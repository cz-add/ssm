package com.zking.ssm.mapper;

import com.zking.ssm.model.Torder;

public interface TorderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Torder record);

    int insertSelective(Torder record);

    Torder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Torder record);

    int updateByPrimaryKey(Torder record);
    Torder loadCasecode(Torder torder);
}