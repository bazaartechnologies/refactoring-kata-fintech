package me.aikin.refactoring.observer.pattern;

import java.util.Observable;
import java.util.Observer;

public class WateringMachine implements Observer {

    private Boolean status;

    public Boolean getStatus() {
        return status;
    }

    public void start() {
        this.status = true;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (((WeatherParams) arg).getTemp() > 10
                && ((WeatherParams) arg).getHumidity() < 55
                && ((WeatherParams) arg).getWindPower() < 4)
            start();
    }
}
