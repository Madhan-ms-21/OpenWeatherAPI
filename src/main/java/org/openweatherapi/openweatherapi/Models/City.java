package org.openweatherapi.openweatherapi.Models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class City implements Serializable {
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
