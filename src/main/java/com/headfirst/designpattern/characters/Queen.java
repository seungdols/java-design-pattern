package com.headfirst.designpattern.characters;

/**
 * Created by Naver on 2016-07-20.
 */
public class Queen extends Character {
    public Queen() {
        weaponBehavior = new SwordBehavior();
    }
}
