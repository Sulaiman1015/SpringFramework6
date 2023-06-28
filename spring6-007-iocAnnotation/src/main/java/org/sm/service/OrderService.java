package org.sm.service;

import org.sm.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    //@Autowired
    //@Qualifier("orderDaoImplOracle")
    //@Qualifier("orderDaoImplPostgres")
    private OrderDao orderDao;

    public void generateOrder(){
        orderDao.insert();
    }

    public OrderService(@Qualifier("orderDaoImplOracle") OrderDao orderDao) {
        this.orderDao = orderDao;
    }
}
