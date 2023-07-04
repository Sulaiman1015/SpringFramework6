package com.sm;

import com.sm.validation.byInterface.CustomScope;
import com.sm.validation.byInterface.ScopeBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanScopeTest {
    ApplicationContext app = new ClassPathXmlApplicationContext("scope.xml");

    @Test
    public void testThreadCustomScope(){
        CustomScope csb = app.getBean("customScopeBean", CustomScope.class);
        System.out.println(csb);

        new Thread(() -> {
            CustomScope csb1 = app.getBean("customScopeBean", CustomScope.class);
            System.out.println(csb1);
            CustomScope csb2 = app.getBean("customScopeBean", CustomScope.class);
            System.out.println(csb2);
        }).start();
    }

    @Test
    public void testTheadScope(){
        ScopeBean sb = app.getBean("scopeBean", ScopeBean.class);
        System.out.println("sb"+sb);
        ScopeBean sb1 = app.getBean("scopeBean", ScopeBean.class);
        System.out.println("sb1"+sb1);

        //start a new thread
        //in this thread has only one bean
        //new Thread(() -> {}).start();//lambda expression
        new Thread(new Runnable() {
            @Override
            public void run() {
                ScopeBean sb2 = app.getBean("scopeBean", ScopeBean.class);
                System.out.println("sb2"+sb2);
                ScopeBean sb3 = app.getBean("scopeBean", ScopeBean.class);
                System.out.println("sb3"+sb3);
            }
        }).start();
    }

    @Test
    public void testBeanScope(){
        //normally scope singleton by default for all beans
        //if scope in xml file is prototype, they are no same beans
        //in web app like spring mvc framework, there is another scope like application, session, request, websocket
        ScopeBean sb1 = app.getBean("scopeBean", ScopeBean.class);
        System.out.println(sb1);
        ScopeBean sb2 = app.getBean("scopeBean", ScopeBean.class);
        System.out.println(sb2);
        String sb = sb1 == sb2 ? "it's singleton scope" : "it's prototype scope";
        System.out.println(sb);
    }
}
