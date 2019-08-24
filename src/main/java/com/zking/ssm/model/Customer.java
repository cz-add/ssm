package com.zking.ssm.model;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString(exclude = "orderList")
public class Customer {
    private Integer customerId;

    private String customerName;
private List<Torder> orderList=new ArrayList<Torder>();
    public Customer(Integer customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public List<Torder> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Torder> orderList) {
        this.orderList = orderList;
    }

    public Customer() {
        super();
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}