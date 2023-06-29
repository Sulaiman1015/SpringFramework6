package com.sm.aopdemo.service.securitylog;

import org.springframework.stereotype.Service;

@Service
public class VipService {
    public void saveVip(){
        System.out.println("save new vip");
    }
    public void deleteVip(){
        System.out.println("delete a vip");
    }
    public void modifyVip(){
        System.out.println("modify a vip info");
    }
    public void getVip(){
        System.out.println("get a vip info");
    }
}
