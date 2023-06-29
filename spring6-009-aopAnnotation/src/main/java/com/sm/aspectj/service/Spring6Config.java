package com.sm.aspectj.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"com.sm.aspectj.service"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Spring6Config {
}
