package com.sm.simpleFactory;

import com.sm.simpleFactory.Weapon;
import com.sm.simpleFactory.WeaponFactory;

public class weaponTest {
    public static void main(String[] args) {
        //need tank
        Weapon tank = WeaponFactory.get("TANK");
        tank.attack();
        //need fighter
        Weapon fighter = WeaponFactory.get("FIGHTER");
        fighter.attack();

    }
}
