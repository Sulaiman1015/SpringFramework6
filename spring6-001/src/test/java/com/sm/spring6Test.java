package com.sm;

import com.sm.bean.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class spring6Test {
    //use log4j2
    @Test
    public void testLog4j2(){
        //bean is created even not invoked getBean(), for example
        new ClassPathXmlApplicationContext("beans.xml");

        //1 create logger obj
        Logger logger = LoggerFactory.getLogger(spring6Test.class);

        //2 print log by level
        logger.info("a msg");
        logger.debug("a test debug");
        logger.error("an error");


    }


    @Test
    public void testBeanFactory(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
        User user = beanFactory.getBean("userBean", User.class);
        System.out.println("user "+user);
    }

    @Test
    public void testApplictionContext(){
        //first, get spring container obj: ApplicationContext (interface)
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");

        //obj get bean by beanId
        Object userBean = appContext.getBean("userBean");
        System.out.println(userBean);

        Object vipBean = appContext.getBean("vipBean");
        System.out.println(vipBean);

        Object timeBean = appContext.getBean("timeBean");
        System.out.println(timeBean);
    }
}
