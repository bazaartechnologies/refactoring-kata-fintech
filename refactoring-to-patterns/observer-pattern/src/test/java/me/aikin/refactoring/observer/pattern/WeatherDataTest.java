package me.aikin.refactoring.observer.pattern;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class WeatherDataTest {

    private final SeedingMachine seedingMachine = new SeedingMachine();
    private final ReapingMachine reapingMachine = new ReapingMachine();
    private final WateringMachine wateringMachine = new WateringMachine();
    private final WeatherData weatherData;

    public WeatherDataTest() {
        weatherData = new WeatherData(seedingMachine, reapingMachine, wateringMachine);
    }

    @Test
    public void seeding_machine_should_start_if_temperature_over_5_degree() {
        weatherData.addObserver(seedingMachine);
        weatherData.measurementsChanged(new WeatherParams(10, 0, 0));

        assertTrue(seedingMachine.getStatus());
    }

    @Test
    public void reaping_machine_should_start_if_temperature_over_5_degree_and_humidity_over_65() {
        weatherData.addObserver(reapingMachine);
        weatherData.measurementsChanged(new WeatherParams(10, 70, 0));
        assertTrue(reapingMachine.getStatus());
    }

    @Test
    public void water_machine_should_start_if_temperature_over_10_degree_and_humidity_less_than_55_and_wind_power_less_than_4() {
        weatherData.addObserver(wateringMachine);
        weatherData.measurementsChanged(new WeatherParams(12, 50, 2));
        assertTrue(wateringMachine.getStatus());
    }

    @Test
    public void reaping_machine_should_not_start_if_temperature_under_5_degree_and_humidity_over_65() {
        weatherData.addObserver(reapingMachine);
        weatherData.measurementsChanged(new WeatherParams(3, 70, 0));
        assertNull(reapingMachine.getStatus());
    }


}