package com.sm.validation.byInterface;

public class User {
    //spring get bean by refection, revoke no param constructor to get new instance
    //Class clazz = Class.forName("com.sm.spring.bean.User");
    //Object obj = clazz.newInstance();
    public User(){
        System.out.println("User constructor running");
    }
}
