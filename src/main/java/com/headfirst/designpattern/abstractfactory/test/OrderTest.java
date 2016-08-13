package com.headfirst.designpattern.abstractfactory.test;

import com.headfirst.designpattern.abstractfactory.NYPizzaStore;
import com.headfirst.designpattern.abstractfactory.PizzaStore;

/**
 * Created by Naver on 2016-07-22.
 */
public class OrderTest {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");

    }
}
