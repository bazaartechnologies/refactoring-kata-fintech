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

        setChanged();
        notifyObservers(weatherParams);
    }
}
