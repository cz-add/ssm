package com.zking.ssm.service;

import com.zking.ssm.model.Torder;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IOrderService {
    @Transactional(readOnly = true)
    Torder loadCasecode(Torder torder);
}
