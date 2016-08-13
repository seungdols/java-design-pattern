package com.headfirst.designpattern.decorator;

/**
 * Created by Naver on 2016-07-21.
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
