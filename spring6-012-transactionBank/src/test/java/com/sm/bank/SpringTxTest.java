package com.sm.bank;

import com.sm.bank.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTxTest {
    @Test
    public void testTransferTx(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = ac.getBean("accountService", AccountService.class);
        accountService.transfer("act01","act02",10000.00);
    }
}
