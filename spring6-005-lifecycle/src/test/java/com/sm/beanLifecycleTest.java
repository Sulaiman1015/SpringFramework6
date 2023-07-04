package com.sm;

import com.sm.validation.byInterface.User;
import com.sm.validation.byInterface.Vip;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLifecycleTest {
    //7 stages lifecycle and 10 stages lifecycle
    @Test
    public void testBeanLifecycle2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("lifecycle7stages.xml");
        Vip vipBean = ac.getBean("vipBean", Vip.class);
        System.out.println("doing step 6 Usage "+vipBean);

        ClassPathXmlApplicationContext cac = (ClassPathXmlApplicationContext) ac;
        cac.close();
    }

    //5 stages lifecycle
    @Test
    public void testBeanLifecycle1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        User userBean = ac.getBean("userBean", User.class);
        System.out.println("doing step 4 Usage "+userBean);

        ClassPathXmlApplicationContext cac = (ClassPathXmlApplicationContext) ac;
        cac.close();
    }
}
