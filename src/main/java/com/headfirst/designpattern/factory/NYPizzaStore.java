package com.headfirst.designpattern.factory;

/**
 * Created by Naver on 2016-07-21.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese"))
            return new NYstyleCheesePizza();
        else if(type.equals("veggie")){
            return new NYStylePepperoniPizza();
        }
        else if(type.equals("pepperoni")){
            return new NYStylePepperoniPizeea();
        }
        else if(type.equals("clam")){
            return new NYStyleClamPizza();
        }else{
            return null;
        }
    }



}
