package com.sm.aspectj.service;

import org.aspectj.lang.ProceedingJoinPoint;


public class LogAspect {

    public void pointCutMethod(){}


    public void beforeAdvice(){
        System.out.println("before advice code");
    }

    public void afterReturningAdvice(){
        System.out.println("after returning advice code");
    }

    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around of top");
        joinPoint.proceed();
        System.out.println("around of bottom");
    }

    public void afterAdvice(){
        System.out.println("after advice code");
    }

}
