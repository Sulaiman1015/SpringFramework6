package com.sm.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Vip implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean, DisposableBean {
    private String name;

    public void setName(String name){
        System.out.println("doing step 2 Property setting");
    }

    public Vip(){
        System.out.println("doing step 1 Instantiation");
    }

    public void initBean(){
        System.out.println("doing step 4 Initialization");
    }

    public void destroyBean(){
        System.out.println("doing step 7 destroy bean");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("doing BeanClassLoaderAware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("doing BeanFactoryAware");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("doing BeanNameAware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("doing InitializingBean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("doing DisposableBean");
    }
}
