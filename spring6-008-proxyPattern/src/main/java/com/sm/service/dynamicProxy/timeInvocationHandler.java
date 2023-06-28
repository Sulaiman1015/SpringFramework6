package com.sm.service.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class timeInvocationHandler implements InvocationHandler {

    private Object obj;

    public timeInvocationHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long begin = System.currentTimeMillis();
        Object o = method.invoke(obj, args);
        long end = System.currentTimeMillis();
        System.out.println("used "+(end - begin)+" millisecond to generated the order");

        return o;
    }
}
