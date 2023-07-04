package com.sm;

import com.sm.validation.byInterface.Order;
import com.sm.validation.byInterface.People;
import com.sm.validation.byInterface.Person;
import com.sm.validation.byInterface.User;
import com.sm.jdbc.MyDataSource;
import com.sm.jdbc.MyDataSource1;
import com.sm.jdbc.MyDataSource2;
import com.sm.service.UserService;
import com.sm.service.VipService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springDiTest {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
    ApplicationContext alc = new ClassPathXmlApplicationContext("collection.xml");
    ApplicationContext app = new ClassPathXmlApplicationContext("p-name-space.xml");
    ApplicationContext ap = new ClassPathXmlApplicationContext("c-name-space.xml");
    ApplicationContext appc = new ClassPathXmlApplicationContext("util-name-space.xml");
    ApplicationContext a = new ClassPathXmlApplicationContext("autowire.xml");


    @Test
    public void testAutowire(){
        UserService userService = a.getBean("userService", UserService.class);
        userService.saveUser();
    }

    @Test
    public void testUtilNameSpace(){
        MyDataSource1 ds1 = appc.getBean("ds1", MyDataSource1.class);
        System.out.println(ds1);
        MyDataSource2 ds2 = appc.getBean("ds2", MyDataSource2.class);
        System.out.println(ds2);
    }

    @Test
    public void testCnameSpace(){
        Object people = ap.getBean("peopleBean", People.class);
        System.out.println(people);
    }

    @Test
    public void testPnameSpace(){
        User user = app.getBean("userBean", User.class);
        System.out.println(user);
    }

    @Test
    public void testCollection(){
        Person person = alc.getBean("personBean", Person.class);
        System.out.println(person);
    }

    @Test
    public void testMyDataSource(){
        MyDataSource myDataSource = applicationContext.getBean("myDataSourceBean", MyDataSource.class);
        System.out.println(myDataSource);
    }

    @Test
    public void testSimpleBeanDI(){
        Order orderBean = applicationContext.getBean("orderBean", Order.class);
        System.out.println(orderBean);
    }

    //set injection
    @Test
    public void testSetDI(){
        UserService userService = applicationContext.getBean("userServiceBean",UserService.class);
        userService.saveUser();

    }

    // constructor injection
    @Test
    public void testContruvtorDI(){
        applicationContext.getBean("vipServiceBean", VipService.class).saveVip();
    }
}
