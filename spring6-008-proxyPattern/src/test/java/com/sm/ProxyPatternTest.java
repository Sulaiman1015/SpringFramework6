package com.sm;

import com.sm.service.OrderService;
import com.sm.service.OrderServiceImpl;
import com.sm.service.dynamicProxy.timeInvocationHandler;
import com.sm.service.staticProxy.OrderServiceStaticProxy;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class ProxyPatternTest {
    @Test
    public void testDynamicProxy(){
        OrderService os = new OrderServiceImpl();
        OrderService proxyInstance = (OrderService) Proxy.newProxyInstance(os.getClass().getClassLoader(), os.getClass().getInterfaces(), new timeInvocationHandler(os));
        proxyInstance.generate();
        proxyInstance.modify();
        proxyInstance.detail();
    }

    @Test
    public void testStaticProxy(){
        OrderService os = new OrderServiceImpl();
        OrderService proxy = new OrderServiceStaticProxy(os);
        proxy.generate();
        proxy.modify();
        proxy.detail();

    }
}
