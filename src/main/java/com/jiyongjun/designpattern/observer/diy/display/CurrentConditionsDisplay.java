package com.jiyongjun.designpattern.observer.diy.display;

import com.jiyongjun.designpattern.observer.diy.DisplayElement;
import com.jiyongjun.designpattern.observer.diy.Observer;
import com.jiyongjun.designpattern.observer.diy.Subject;

/**
 * description: 当前状况布告板
 *
 * @author yongjun.ji
 * @date 2018/4/28.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature 
                + "F degrees and " + humidity + "% humidity");
    }
}
