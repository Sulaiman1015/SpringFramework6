package com.sm.service;

public class OrderServiceImpl implements OrderService{
    @Override
    public void generate() {
        System.out.println("generate order");
    }

    @Override
    public void modify() {
        System.out.println("modify order");
    }

    @Override
    public void detail() {
        System.out.println("detail order");
    }
}
