package com.jiyongjun.designpattern.observer.jdk;

/**
 * description:
 *
 * @author yongjun.ji
 * @date 2018/4/28.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(87, 90, 29.2f);
    }
}
