package com.sm.aspectj;

import com.sm.aspectj.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {

    @Test
    public void testAspect(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-aspect.xml");
        UserService userService = ac.getBean("userService", UserService.class);
        userService.login();
        userService.logout();

    }
}
