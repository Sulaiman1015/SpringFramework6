package com.sm.service.staticProxy;

import com.sm.service.OrderService;

public class OrderServiceStaticProxy implements OrderService {
    //use static proxy pattern, when there isn't more proxy class to manage.

    //generalization (is a) highly coupled, use carefully
    //association (has a) low coupled, and interface recommend to use

    private final OrderService orderService;

    //pass orderService by constructor
    public OrderServiceStaticProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void generate() {
        long begin = System.currentTimeMillis();
        orderService.generate();
        long end = System.currentTimeMillis();
        System.out.println("used "+(end - begin)+" to generated the order");
    }

    @Override
    public void modify() {
        long begin = System.currentTimeMillis();
        orderService.modify();
        long end = System.currentTimeMillis();
        System.out.println("used "+(end - begin)+" to modified the order");
    }

    @Override
    public void detail() {
        long begin = System.currentTimeMillis();
        orderService.detail();
        long end = System.currentTimeMillis();
        System.out.println("used "+(end - begin)+" to get detail the order");
    }
}
