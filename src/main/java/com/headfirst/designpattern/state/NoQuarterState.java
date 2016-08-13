package com.headfirst.designpattern.state;

/**
 * Created by Naver on 2016-07-26.
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전 삽입");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전 삽입 해주세요.");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전 삽입 해주세요.");
    }

    @Override
    public void dispense() {
        System.out.println("동전 삽입 해주세요.");
    }
}
