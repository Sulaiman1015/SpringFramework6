package com.sm.reflect.test;

import com.sm.reflect.annotation.Component;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ComponentScan {
    public static void main(String[] args) {
        Map<String, Object> beanMap = new HashMap<>();

        //question: if we have a package then get all beans in this package
        String packName = "com.sm.bean";

        //create a scan component app
        String packPath = packName.replaceAll("\\.","/");
        //System.out.println(packPath);

        URL url = ClassLoader.getSystemClassLoader().getResource(packPath);
        String path = url.getPath();
        //System.out.println(path);

        File file = new File(path);
        File[] files = file.listFiles();
        Arrays.stream(files).forEach(f -> {
            try{
                //System.out.println(f.getName());
                //System.out.println(f.getName().split("\\.")[0]);
                String fullClassName = packName+"."+f.getName().split("\\.")[0];
                //System.out.println(fullClassName);

                Class<?> aClass = Class.forName(fullClassName);
                if (aClass.isAnnotationPresent(Component.class)) {
                    Component annotation = aClass.getAnnotation(Component.class);
                    String value = annotation.value();
                    Object obj = aClass.newInstance();

                    beanMap.put(value, obj);

                }

            }catch (Exception e){
                e.printStackTrace();
            }


        });
        System.out.println(beanMap);

    }
}
