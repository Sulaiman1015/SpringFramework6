package com.sm.bank;

import com.sm.bank.fullxml.service.ActService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankTxTest {
    @Test
    public void textFullXML(){
        ApplicationContext apc = new ClassPathXmlApplicationContext("springfull.xml");
        ActService actService = apc.getBean("actService", ActService.class);
        actService.transfer("act01","act02",5000.00);
    }
}
