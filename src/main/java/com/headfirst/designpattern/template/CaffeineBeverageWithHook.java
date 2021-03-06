package com.headfirst.designpattern.template;

/**
 * Created by Naver on 2016-07-25.
 */
public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    public boolean customerWantsCondiments() {
        return true;
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    public void boilWater() {
        System.out.println("물 끓이는 중");
    }

    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}
