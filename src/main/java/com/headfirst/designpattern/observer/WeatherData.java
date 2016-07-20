package com.headfirst.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Naver on 2016-07-20.
 */
public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int idx = observers.indexOf(o);
        if( idx >= 0){
            observers.remove(idx);
        }
    }

    @Override
    public void notifyObserver() {
        for( int idx = 0; idx < observers.size(); idx++ ){
            Observer observer = (Observer)observers.get(idx);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
