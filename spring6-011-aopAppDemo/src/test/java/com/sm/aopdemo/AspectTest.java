package com.sm.aopdemo;

import com.sm.aopdemo.service.securitylog.UserService;
import com.sm.aopdemo.service.securitylog.VipService;
import com.sm.aopdemo.service.transaction.AccountService;
import com.sm.aopdemo.service.transaction.OperateService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectTest {
    @Test
    public void testSecurityLog(){
        ApplicationContext app = new ClassPathXmlApplicationContext("aop-demo.xml");
        UserService userService = app.getBean("userService", UserService.class);
        VipService vipService = app.getBean("vipService", VipService.class);

        userService.saveUser();
        userService.deleteUser();
        userService.modifyUser();
        userService.getUser();

        vipService.saveVip();
        vipService.deleteVip();
        vipService.modifyVip();
        vipService.getVip();


    }

    @Test
    public void testTransaction(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop-demo.xml");
        AccountService as = ac.getBean("accountService", AccountService.class);
        as.checkAccount();
        as.printAccount();

        OperateService os = ac.getBean("operateService", OperateService.class);
        os.transfer();
        os.withdraw();


    }
}
