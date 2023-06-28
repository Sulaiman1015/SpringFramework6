package com.sm.simpleFactory;

public class WeaponFactory {
    public static Weapon get(String weaponType){
        if ("TANK".equals(weaponType)) {
            return new Tank();
        }else if("FIGHTER".equals(weaponType)){
            return new Fighter();
        }else{
            throw new RuntimeException("not support");
        }
    }
}
