package com.sm.bank.hybrid.dao;

import com.sm.bank.hybrid.pojo.Account;

public interface AccountDao {
    Account selectByActno(String actno);

    //return int: how many infos get update
    int update(Account act);

}
