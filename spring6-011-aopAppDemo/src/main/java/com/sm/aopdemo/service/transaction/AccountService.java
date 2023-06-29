package com.sm.aopdemo.service.transaction;

import org.springframework.stereotype.Service;

@Service
public class AccountService {
    public void checkAccount(){
        System.out.println("check account");
    }
    public void printAccount(){
        System.out.println("print account");
    }
}
