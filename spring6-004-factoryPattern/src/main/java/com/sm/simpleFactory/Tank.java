package com.sm.simpleFactory;

public class Tank extends Weapon{
    @Override
    public void attack() {
        System.out.println("Tank fire");
    }
}
