package com.sm.service;

import com.sm.dao.VipDao;

public class VipService {
    private VipDao vipDao;

    //constructor injection
    public VipService(VipDao vipDao) {
        this.vipDao = vipDao;
    }

    public void saveVip(){
        vipDao.upDate();
    }
}
