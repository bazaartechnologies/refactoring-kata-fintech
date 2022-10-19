package me.aikin.refactoring.observer.pattern;

import java.util.Observable;
import java.util.Observer;

public class SeedingMachine implements Observer {
    private Boolean status;

    public Boolean getStatus() {
        return status;
    }

    public void start() {
        this.status = true;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (((WeatherParams) arg).getTemp() > 5) {
            start();
        }
    }
}
