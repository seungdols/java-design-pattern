package com.headfirst.designpattern.characters;

/**
 * Created by Naver on 2016-07-20.
 */
public class Knight extends Character {
    public Knight() {
        weaponBehavior = new BowAndArrowBehavior();
    }
}
