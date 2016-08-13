package com.headfirst.designpattern.decorator;

/**
 * Created by Naver on 2016-07-21.
 */
public abstract class Beverage {
    String description = "No title";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
