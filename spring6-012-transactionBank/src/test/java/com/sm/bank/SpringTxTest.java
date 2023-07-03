package com.sm.bank;

import com.sm.bank.hybrid.Spring6TxConfig;
import com.sm.bank.hybrid.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTxTest {

    @Test
    public void testNoXML(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(Spring6TxConfig.class);
        AccountService accountService = ac.getBean("accountService", AccountService.class);
        try{
            accountService.transfer("act02","act01",10000.00);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testTransferTx(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = ac.getBean("accountService", AccountService.class);
        accountService.transfer("act01","act02",10000.00);
    }
}
