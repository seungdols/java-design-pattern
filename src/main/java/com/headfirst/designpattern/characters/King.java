package com.headfirst.designpattern.characters;

/**
 * Created by Naver on 2016-07-20.
 */
public class King extends Character {
    public King() {
        weaponBehavior = new AxeBehavior(); // Axe
    }
}
