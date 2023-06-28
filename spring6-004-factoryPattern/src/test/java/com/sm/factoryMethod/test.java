package com.sm.factoryMethod;

public class test {
    public static void main(String[] args) {
        WeaponFactory wf1 = new GunFactory();
        wf1.get().attack();
        WeaponFactory wf2 = new DaggerFactory();
        wf2.get().attack();
    }
}
