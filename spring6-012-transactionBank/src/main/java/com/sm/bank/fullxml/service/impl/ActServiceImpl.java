package com.sm.bank.fullxml.service.impl;

import com.sm.bank.fullxml.dao.ActDao;
import com.sm.bank.fullxml.pojo.Act;
import com.sm.bank.fullxml.service.ActService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("actService")
public class ActServiceImpl implements ActService {

    @Resource(name="actDao")
    private ActDao actDao;

    @Override
    public void transfer(String fromActno, String toActno, Double money) {

        Act fromAct = actDao.selectByActno(fromActno);

        if (fromAct.getBalance() < money){
            throw new RuntimeException("Insufficient account balance");
        }


        Act toAct = actDao.selectByActno(toActno);

        //modify balance in memory when transfer money
        fromAct.setBalance(fromAct.getBalance() - money);
        toAct.setBalance(toAct.getBalance() + money);

        //save the changed balance in db
        int count = actDao.update(fromAct);
        //mock exception
        String s = null;
        //s.toString();
        count += actDao.update(toAct);

        if(count != 2){
            throw new RuntimeException("transfer failed");
        }else {
            System.out.println("transfer successful");
        }

    }
}
