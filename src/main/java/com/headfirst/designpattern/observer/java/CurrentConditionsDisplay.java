package com.headfirst.designpattern.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Naver on 2016-07-20.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElment {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions : "+ temperature + "F degrees and " + humidity + "% humidity");

    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
