package com.headfirst.designpattern.factory;

/**
 * Created by Naver on 2016-07-21.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese"))
            return new ChicagoStyleCheesePizza();
        else if(type.equals("veggie")){
            return new ChicagoStylePepperoniPizza();
        }
        else if(type.equals("pepperoni")){
            return new ChicagoStylePepperoniPizeea();
        }
        else if(type.equals("clam")){
            return new ChicagoStyleClamPizza();
        }else{
            return null;
        }
    }
}
