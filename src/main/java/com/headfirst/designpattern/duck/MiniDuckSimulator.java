package com.headfirst.designpattern.duck;

/**
 * Created by Naver on 2016-07-20.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}
