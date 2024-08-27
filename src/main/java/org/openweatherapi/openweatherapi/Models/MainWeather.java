package org.openweatherapi.openweatherapi.Models;

// MainWeather.java

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MainWeather {
    private double temp;
    private double feels_like;
    private double temp_min;
    private double temp_max;
    private int pressure;
    private int humidity;
    private int sea_level;
    private int grnd_level;

    // Getters and Setters
}
