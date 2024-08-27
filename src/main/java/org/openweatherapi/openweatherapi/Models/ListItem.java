package org.openweatherapi.openweatherapi.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ListItem {
    private long dt;
    private MainWeather main;
    private List<Weather> weather;
    private Clouds clouds;
    private Wind wind;
    private int visibility;
    private double pop;
    private Rain rain;
    private Sys sys;
    private String dt_txt;

    // Getters and Setters
}
