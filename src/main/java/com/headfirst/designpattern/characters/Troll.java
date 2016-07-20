package com.headfirst.designpattern.characters;

/**
 * Created by Naver on 2016-07-20.
 */
public class Troll extends Character {
    public Troll() {
        weaponBehavior = new KnifeBehavior();
    }
}
