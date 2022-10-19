package me.aikin.refactoring.observer.pattern;

import java.util.Observable;

public class ReapingMachine extends Machine {

    @Override
    public void update(Observable o, Object arg) {
        if (((WeatherParams) arg).getTemp() > 5 && ((WeatherParams) arg).getHumidity() > 65) {
            start();
        }
    }
}
