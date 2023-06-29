package com.sm.aopdemo.service.securitylog;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void saveUser(){
        System.out.println("save new user");
    }
    public void deleteUser(){
        System.out.println("delete a user");
    }
    public void modifyUser(){
        System.out.println("modify a user info");
    }
    public void getUser(){
        System.out.println("get a user info");
    }
}
