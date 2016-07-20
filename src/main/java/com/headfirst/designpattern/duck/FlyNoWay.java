package com.headfirst.designpattern.duck;

/**
 * Created by Naver on 2016-07-20.
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Don't fly");
    }
}
