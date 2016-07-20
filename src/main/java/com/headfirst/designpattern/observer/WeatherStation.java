package com.headfirst.designpattern.observer;

/**
 * Created by Naver on 2016-07-20.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 27.F);
        weatherData.setMeasurements(80, 61, 20.F);
        weatherData.setMeasurements(65, 64, 30.F);
        weatherData.setMeasurements(70, 65, 11.F);
        weatherData.setMeasurements(41, 63 , 20.F);
    }
}
