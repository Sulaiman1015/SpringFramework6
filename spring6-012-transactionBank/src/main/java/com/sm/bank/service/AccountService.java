package com.sm.bank.service;

public interface AccountService {

    void transfer(String fromActno, String toActno, Double money);

}
