package org.openweatherapi.openweatherapi.Models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

// Weather.java
@Setter
@Getter
public class Weather implements Serializable {
    private int id;
    private String main;
    private String description;
    private String icon;

    // Getters and Setters
}
