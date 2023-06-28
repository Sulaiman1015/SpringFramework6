package com.sm.annotation;

import com.sm.reflect.annotation.Component;
import org.junit.Test;

public class AnnotationTest {
    @Test
    public void testReflectAnnotation() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.sm.reflect.bean.User");
        if (aClass.isAnnotationPresent(Component.class)) {
            Component annotation = aClass.getAnnotation(Component.class);
            System.out.println(annotation.value());
        }
    }
    
}
