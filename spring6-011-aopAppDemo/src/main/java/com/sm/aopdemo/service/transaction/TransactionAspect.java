package com.sm.aopdemo.service.transaction;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionAspect {

    @Around("execution(* com.sm.aopdemo.service..*(..))")
    public void aroundAdvice(ProceedingJoinPoint joinPoint){

        try {
            System.out.println("open transaction");
            joinPoint.proceed();
            System.out.println("commit transaction");
        } catch (Throwable e) {
            System.out.println("rollback transaction");
        }


    }
}
