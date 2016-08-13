package com.headfirst.designpattern.abstractfactory;

/**
 * Created by Naver on 2016-07-22.
 */
public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        pepperoni = pizzaIngredientFactory.createPepperoni();
    }
}
