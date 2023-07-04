package com.sm.validation.byInterface;

public class People {
    private String name;
    private int age;
    private boolean sex;

    //c-name-space injection based on constructor
    public People(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
