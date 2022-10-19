package me.aikin.refactoring.observer.pattern;

public class WeatherParams {
    private final int temp;
    private final int humidity;
    private final int windPower;

    public WeatherParams(int temp, int humidity, int windPower) {
        this.temp = temp;
        this.humidity = humidity;
        this.windPower = windPower;
    }

    public int getTemp() {
        return temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getWindPower() {
        return windPower;
    }
}
