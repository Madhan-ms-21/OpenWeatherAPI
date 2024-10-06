package org.openweatherapi.openweatherapi.Models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

// Wind.java
@Setter
@Getter
public class Wind implements Serializable {
    private double speed;
    private int deg;
    private double gust;

    // Getters and Setters
}
