package com.sm.ioc.beans1;

import com.sm.reflect.annotation.Component;
import org.springframework.stereotype.Controller;

@Controller
public class A {
    public A(){
        System.out.println("A controller");
    }
}
