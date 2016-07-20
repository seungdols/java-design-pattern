package com.headfirst.designpattern.characters;

/**
 * Created by Naver on 2016-07-20.
 */
public abstract class Character {
    WeaponBehavior weaponBehavior;

    public Character() {
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
    public void fight(){
        weaponBehavior.useWeapon();
    }

}
