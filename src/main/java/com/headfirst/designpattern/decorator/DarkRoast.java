package com.headfirst.designpattern.decorator;

/**
 * Created by Naver on 2016-07-21.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
