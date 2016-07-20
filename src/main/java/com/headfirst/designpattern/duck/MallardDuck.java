package com.headfirst.designpattern.duck;

/**
 * Created by Naver on 2016-07-20.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("I'm Duck");
    }
}
