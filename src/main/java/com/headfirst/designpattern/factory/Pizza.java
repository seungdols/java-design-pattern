package com.headfirst.designpattern.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Naver on 2016-07-21.
 */
public class Pizza {
    String name;
    String dough;
    String sauce;
    List toppings = new ArrayList();

    public void prepare() {
        System.out.println("Preparing "+ name);
        System.out.println("Tossing dough..");
        System.out.println("Adding sauce..");
        System.out.println("Adding toppings: ");
        for (int idx = 0; idx < toppings.size(); idx++){
            System.out.println("    " + toppings.get(idx));
        }
    }

    public void bake() {
        System.out.println("Bake for 25 mins at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
