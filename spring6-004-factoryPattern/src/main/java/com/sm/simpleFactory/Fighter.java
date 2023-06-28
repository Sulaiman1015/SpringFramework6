package com.sm.simpleFactory;

public class Fighter extends Weapon{
    @Override
    public void attack() {
        System.out.println("Fighter fire");
    }
}
