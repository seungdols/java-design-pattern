package com.headfirst.designpattern.decorator;

/**
 * Created by Naver on 2016-07-21.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
