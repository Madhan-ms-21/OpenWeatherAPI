package org.openweatherapi.openweatherapi.Models;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

// WeatherResponse.java

@Setter
@Getter
public class weatherInfo {
    private Coordinates coord;
    private List<Weather> weather;
    private String base;
    private MainWeather main;
    private int visibility;
    private Wind wind;
    private Rain rain;
    private Clouds clouds;
    private long dt;
    private Sys sys;
    private int timezone;
    private int id;
    private String name;
    private int cod;

    // Getters and Setters
}

