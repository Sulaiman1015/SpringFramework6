package com.sm.aspectj.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class LogAspect {
    /**
     *     aspect = advice + pointcut
     *     Before advice –@Before
     *     Around advice – @Around
     *     After returning – @AfterReturning
     *     After throwing – @AfterThrowing
     *     After (finally) advice – @After
     *
     *     execution – for matching method execution join points. This is the most widely used PCD.
     * within – for matching methods of classes within certain types e.g. classes within a package.
     * @within – for matching to join points within types (target object class) that have the given annotation.
     * this – for matching to join points (the execution of methods) where the bean reference (Spring AOP proxy) is an instance of the given type.
     * target – for matching with the target object of the specific instance type.
     * @target – for matching with the target object annotated with a specific annotation.
     * args – for matching with methods where its arguments are of a specific type.
     * @args – for matching with methods where its arguments are annotated with a specific annotation.
     * @annotation – for matching to join points where the subject (method) of the Joinpoint has the given annotation.
     * bean (idOrNameOfBean) – This PCD lets you limit the matching of join points to a particular named Spring bean or to a set of named Spring beans (when using wildcards).
     *
     *
     * execution(modifiers-pattern? return-type-pattern declaring-type-pattern? name-pattern( param-pattern) throws-pattern?)
     * ? – Means optional to specify, e.g. modifiers, throws_exception
     * * – A star in the pattern represents a wildcard
     * () – For parameter_pattern means no arguments
     * (..) – For matching for parameter_pattern with zero or more arguments of any type
     * (*) – pattern matches a method that takes one parameter of any type.
     * (*, String) – matches a method that takes two parameters, first one is of any type and the second parameter of type string.
     */
    @Pointcut("execution(* com.sm.aspectj.service.UserService.*(..))")
    public void pointCutMethod(){}

    @Before("execution(* com.sm.aspectj.service.UserService.login(..))")
    public void beforeAdvice(){
        System.out.println("before advice code");
    }
    @AfterReturning("execution(* com.sm.aspectj.service.UserService.logout(..))")
    public void afterReturningAdvice(){
        System.out.println("after returning advice code");
    }
    @Around("pointCutMethod()")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around of top");
        joinPoint.proceed();
        System.out.println("around of bottom");
    }
    @After("pointCutMethod()")
    public void afterAdvice(){
        System.out.println("after advice code");
    }

}
