package com.zking.ssm.service;

import com.zking.ssm.model.Customer;
import com.zking.ssm.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ICustomeService {
    int add(Customer customer);
    int edit(Customer customer);
    int del(Customer customer);
    @Transactional(readOnly = true)
    Customer load(Customer customer);
    @Transactional(readOnly = true)
    List<Customer> list(Customer customer, PageBean pageBean);
    @Transactional(readOnly = true)
    Customer loadCasecode(Customer customer);
}
