package org.sm.dao.impl;

import org.sm.dao.OrderDao;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImplOracle implements OrderDao {
    @Override
    public void insert() {
        System.out.println("insert data into OracleSQL");
    }
}
