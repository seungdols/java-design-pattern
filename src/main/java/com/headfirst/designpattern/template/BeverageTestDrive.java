package com.headfirst.designpattern.template;

/**
 * Created by Naver on 2016-07-25.
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        teaWithHook.prepareRecipe();

        coffeeWithHook.prepareRecipe();
    }
}
