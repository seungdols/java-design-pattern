package com.headfirst.designpattern.abstractfactory;

/**
 * Created by Naver on 2016-07-22.
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();


}
