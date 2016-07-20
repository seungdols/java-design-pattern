package com.headfirst.designpattern.characters;

/**
 * Created by Naver on 2016-07-20.
 */
public class CharacterSimulator {
    public static void main(String[] args) {
        King king = new King();
        king.fight();
        Knight knight = new Knight();
        knight.fight();
    }
}
