package com.sm.bank.fullxml.dao;

import com.sm.bank.fullxml.pojo.Act;

public interface ActDao {
    Act selectByActno(String actno);

    //return int: how many infos get update
    int update(Act act);

}
