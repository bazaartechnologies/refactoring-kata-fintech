package me.aikin.refactoring.observer.pattern;

import java.util.Observable;
import java.util.Observer;

public class ReapingMachine implements Observer {
    private Boolean status;

    public Boolean getStatus() {
        return status;
    }

    public void start() {
        this.status = true;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (((WeatherParams) arg).getTemp() > 5 && ((WeatherParams) arg).getHumidity() > 65) {
            start();
        }
    }
}
