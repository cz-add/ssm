package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.TorderMapper;
import com.zking.ssm.model.Torder;
import com.zking.ssm.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private TorderMapper torderMapper;
    @Override
    public Torder loadCasecode(Torder torder) {
        return torderMapper.loadCasecode(torder);
    }
}
