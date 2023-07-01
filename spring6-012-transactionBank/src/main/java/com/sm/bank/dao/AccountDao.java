package com.sm.bank.dao;

import com.sm.bank.pojo.Account;

public interface AccountDao {
    Account selectByActno(String actno);

    //return int: how many infos get update
    int update(Account act);

}
