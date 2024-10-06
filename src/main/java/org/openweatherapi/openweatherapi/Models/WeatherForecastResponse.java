package org.openweatherapi.openweatherapi.Models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class WeatherForecastResponse implements Serializable {
    private String cod;
    private int message;
    private int cnt;
    private List<ListItem> list;
    private City city;

    // Getters and Setters
}