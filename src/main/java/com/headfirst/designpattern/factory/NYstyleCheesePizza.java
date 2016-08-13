package com.headfirst.designpattern.factory;

/**
 * Created by Naver on 2016-07-21.
 */
public class NYstyleCheesePizza extends Pizza{
    public NYstyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
