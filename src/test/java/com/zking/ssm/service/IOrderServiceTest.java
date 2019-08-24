package com.zking.ssm.service;

import com.zking.ssm.model.Torder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class IOrderServiceTest extends BaseTestCase {
    @Autowired
    private IOrderService orderService;

    private Torder torder;
    @Before
    public void setUp()  {
        torder=new Torder();
    }

    @Test
    public void loadCasecode() throws Exception {
        torder.setOrderId(1);
        Torder o = orderService.loadCasecode(orderService.loadCasecode(torder));
        System.out.println(o);
        System.out.println(o.getCustomer());
    }

}