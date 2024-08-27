package org.openweatherapi.openweatherapi.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WeatherForecastResponse {
    private String cod;
    private int message;
    private int cnt;
    private List<ListItem> list;
    private City city;

    // Getters and Setters
}