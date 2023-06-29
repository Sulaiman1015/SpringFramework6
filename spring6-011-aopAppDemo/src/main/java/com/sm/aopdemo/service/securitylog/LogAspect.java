package com.sm.aopdemo.service.securitylog;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Aspect
@Component
public class LogAspect {
    @Pointcut("execution(* com.sm.aopdemo.service.securitylog..save*(..))")
    public void savePointCut() {
    }

    @Pointcut("execution(* com.sm.aopdemo.service.securitylog..delete*(..))")
    public void deletePointCut() {
    }

    @Pointcut("execution(* com.sm.aopdemo.service.securitylog..modify*(..))")
    public void modifyPointCut() {
    }

    @Before("savePointCut() || deletePointCut() || modifyPointCut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss SSS");
        String timeNow = sdf.format(new Date());
        System.out.println(timeNow + " user: "
                + joinPoint.getSignature().getDeclaringTypeName() + "."
                + joinPoint.getSignature().getName());

    }
}
