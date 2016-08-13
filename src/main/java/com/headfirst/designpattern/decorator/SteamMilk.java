package com.headfirst.designpattern.decorator;

/**
 * Created by Naver on 2016-07-21.
 */
public class SteamMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", SteamMilk";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
