package com.headfirst.designpattern.state;

/**
 * Created by Naver on 2016-07-26.
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("Now is Sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Now is Sold out");
    }

    @Override
    public void turnCrank() {
        System.out.println("Now is Sold out");
    }

    @Override
    public void dispense() {
        System.out.println("Now is Sold out");
    }
}
