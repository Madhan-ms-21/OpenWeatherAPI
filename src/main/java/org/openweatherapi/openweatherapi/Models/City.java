package org.openweatherapi.openweatherapi.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class City {
    private int id;
    private String name;
    private Coordinates coord;
    private String country;
    private int population;
    private int timezone;
    private long sunrise;
    private long sunset;

    // Getters and Setters
}
