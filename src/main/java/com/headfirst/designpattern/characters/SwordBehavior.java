package com.headfirst.designpattern.characters;

/**
 * Created by Naver on 2016-07-20.
 */
public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Sword slash");
    }
}
