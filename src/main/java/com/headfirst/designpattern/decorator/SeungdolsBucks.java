package com.headfirst.designpattern.decorator;

/**
 * Created by Naver on 2016-07-21.
 */
public class SeungdolsBucks {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();//.99
        beverage1 =  new Mocha(beverage1);//.20
        beverage1 =  new Mocha(beverage1);//.20
        beverage1 =  new Whip(beverage1);//.10
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
        Beverage beverage2 = new HouseBlend();
        beverage2 =  new Soy(beverage2);
        beverage2 =  new Mocha(beverage2);
        beverage2 =  new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());


    }
}
