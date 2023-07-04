package com.sm.validation.byInterface;

public class Person {
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * get
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * set
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * set
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
}
