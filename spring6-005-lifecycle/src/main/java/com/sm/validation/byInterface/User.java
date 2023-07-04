package com.sm.validation.byInterface;

public class User {
    //1: Instantiation, invoking constructor
    //2: Property setting (attribute assignment), invoking setter method
    //3: Initialization, using custom initialization method within bean class
    //4: Usage
    //5: Destruction
    private String name;

    public void setName(String name){
        System.out.println("doing step 2 Property setting");
    }

    public User(){
        System.out.println("doing step 1 Instantiation");
    }

    public void initBean(){
        System.out.println("doing step 3 Initialization");
    }

    public void destroyBean(){
        System.out.println("doing step 5 destroy bean");
    }
}
