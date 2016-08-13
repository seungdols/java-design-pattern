package com.headfirst.designpattern.state;

/**
 * Created by Naver on 2016-07-26.
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
