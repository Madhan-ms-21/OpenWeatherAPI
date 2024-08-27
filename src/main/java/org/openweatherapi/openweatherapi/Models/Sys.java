package org.openweatherapi.openweatherapi.Models;

import lombok.Getter;
import lombok.Setter;

// Sys.java
@Setter
@Getter
public class Sys {
    private int type;
    private int id;
    private String country;
    private long sunrise;
    private long sunset;

    // Getters and Setters
}
