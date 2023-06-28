package com.sm.service;

import com.sm.dao.UserDao;

public class UserService {

    private UserDao userDao;
    //Dependency Injection with set method injection
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser(){
        userDao.insert();
    }

}
