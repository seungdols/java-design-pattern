package com.headfirst.designpattern.observer;

/**
 * Created by Naver on 2016-07-20.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();

}
