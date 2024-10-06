package org.openweatherapi.openweatherapi.Models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

// Sys.java
@Setter
@Getter
public class Sys implements Serializable {
    private int type;
    private int id;
    private String country;
    private long sunrise;
    private long sunset;

    // Getters and Setters
}
