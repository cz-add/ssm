package com.zking.ssm.service;

import com.zking.ssm.model.Customer;
import com.zking.ssm.model.Torder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class ICustomeServiceTest extends BaseTestCase {

    @Autowired
    private ICustomeService customeService;

    private Customer customer;

    @Override
    public void setUp() {
        super.setUp();
        customer=new Customer();
    }

    @Test
    public void add() throws Exception {
        customer.setCustomerName("张三");
        customeService.add(customer);
    }

    @Test
    public void edit() throws Exception {
    }

    @Test
    public void del() throws Exception {
    }

    @Test
    public void load() throws Exception {
        customer.setCustomerId(2);
        Customer load = customeService.load(customer);
        System.out.println(load);
        Customer loadCasecode = customeService.loadCasecode(customer);
        for (Torder o :loadCasecode.getOrderList()) {
            System.out.println(o);
        }
        System.out.println(loadCasecode);
    }

    @Test
    public void list() throws Exception {
        List<Customer> customerList = customeService.list(customer, pageBean);
        for (Customer c:customerList) {
            System.out.println(c);
        }
    }


}