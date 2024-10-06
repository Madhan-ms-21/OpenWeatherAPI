package org.openweatherapi.openweatherapi.Models;

// Coordinates.java

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Coordinates implements Serializable {
    private double lon;
    private double lat;

    // Getters and Setters
}
