package me.aikin.refactoring.observer.pattern;

import java.util.Observable;

public class SeedingMachine  extends Machine {

    @Override
    public void update(Observable o, Object arg) {
        if (((WeatherParams) arg).getTemp() > 5) {
            start();
        }
    }
}
