package com.headfirst.designpattern.duck;

/**
 * Created by Naver on 2016-07-20.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
