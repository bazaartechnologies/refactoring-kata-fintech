package me.aikin.refactoring.observer.pattern;

import java.util.Observable;

public class WateringMachine extends Machine {


    @Override
    public void update(Observable o, Object arg) {
        if (((WeatherParams) arg).getTemp() > 10
                && ((WeatherParams) arg).getHumidity() < 55
                && ((WeatherParams) arg).getWindPower() < 4)
            start();
    }
}
