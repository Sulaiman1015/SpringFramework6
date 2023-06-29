package com.sm.aspectj;

import com.sm.aspectj.service.Spring6Config;
import com.sm.aspectj.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    @Test
    public void testNoXML(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.login();
        userService.logout();
    }

    @Test
    public void testAspect(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-aop.xml");
        UserService userService = ac.getBean("userService", UserService.class);
        userService.login();
        userService.logout();

    }
}
