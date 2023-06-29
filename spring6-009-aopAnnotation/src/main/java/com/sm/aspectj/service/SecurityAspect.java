package com.sm.aspectj.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Aspect
@Order(1)
public class SecurityAspect {
    @Before("execution(* com.sm.aspectj.service.UserService.*(..))")
    public void beforeAdvice(){
        System.out.println("security before advice");
    }
}
