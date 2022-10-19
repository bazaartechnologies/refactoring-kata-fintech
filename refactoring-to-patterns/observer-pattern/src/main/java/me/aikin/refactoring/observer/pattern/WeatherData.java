package me.aikin.refactoring.observer.pattern;

import java.util.Observable;

public class WeatherData extends Observable {
    private final SeedingMachine seedingMachine;
    private final ReapingMachine reapingMachine;
    private final WateringMachine wateringMachine;

    public WeatherData(SeedingMachine seedingMachine, ReapingMachine reapingMachine, WateringMachine wateringMachine) {
        this.seedingMachine = seedingMachine;
        this.reapingMachine = reapingMachine;
        this.wateringMachine = wateringMachine;
    }

    public void measurementsChanged(WeatherParams weatherParams) {
        if (weatherParams.getTemp() > 5) {
            seedingMachine.start();

        setChanged();
        notifyObservers(weatherParams.getTemp());

            if (weatherParams.getHumidity() > 65)
                reapingMachine.start();
        }

        if (weatherParams.getTemp() > 10 && weatherParams.getHumidity() < 55 && weatherParams.getWindPower() < 4)
            wateringMachine.start();
    }
}
