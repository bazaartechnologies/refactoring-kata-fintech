package me.aikin.refactoring.observer.pattern;

import java.util.Observable;

public class WeatherData extends Observable {

    public void measurementsChanged(WeatherParams weatherParams) {

        setChanged();
        notifyObservers(weatherParams);
    }
}
