package com.sm;


import com.sm.bean.setterMode.Husband;
import com.sm.bean.setterMode.Wife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularDependencyTest {
    @Test
    public void testCD(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Husband husbandBean = ac.getBean("husbandBean", Husband.class);
        System.out.println(husbandBean);
        Wife wifeBean = ac.getBean("wifeBean", Wife.class);
        System.out.println(wifeBean);
    }

}
