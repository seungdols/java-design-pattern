package com.headfirst.designpattern.observer.java;

/**
 * Created by Naver on 2016-07-20.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 15, 8.F);
        weatherData.setMeasurements(20, 35, 37.F);
        weatherData.setMeasurements(10, 75, 45.F);
        weatherData.setMeasurements(81, 65, 26.F);
        weatherData.setMeasurements(85, 45, 99.F);
    }
}
