package com.sm.bank.service.impl;

import com.sm.bank.dao.AccountDao;
import com.sm.bank.pojo.Account;
import com.sm.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService {

    @Resource(name="accountDao")
    private AccountDao accountDao;

    @Override
    //@Transactional
    public void transfer(String fromActno, String toActno, Double money) {

        Account fromAct = accountDao.selectByActno(fromActno);

        if (fromAct.getBalance() < money){
            throw new RuntimeException("Insufficient account balance");
        }

        Account toAct = accountDao.selectByActno(toActno);

        //modify balance in memory when transfer money
        fromAct.setBalance(fromAct.getBalance() - money);
        toAct.setBalance(toAct.getBalance() + money);

        //save the changed balance in db
        int count = accountDao.update(fromAct);
        //mock exception
        String s = null;
        //s.toString();
        count += accountDao.update(toAct);

        if(count != 2){
            throw new RuntimeException("transfer failed");
        }else {
            System.out.println("transfer successful");
        }

    }
}
