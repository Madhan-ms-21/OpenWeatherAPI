package org.openweatherapi.openweatherapi.Controller;

import org.openweatherapi.openweatherapi.Models.WeatherForecastResponse;
import org.openweatherapi.openweatherapi.Models.weatherInfo;
import org.openweatherapi.openweatherapi.Services.WeatherServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
public class Controller {

    @Autowired
    private WeatherServices service;

    @GetMapping("/now/{lat}/{lon}")
    public ResponseEntity<weatherInfo> getWeatherNow(@PathVariable double lat, @PathVariable double lon) {
        weatherInfo weatherInfo = service.getWeatherService(lat,lon);
        return new ResponseEntity<>(weatherInfo, HttpStatusCode.valueOf(200));
    }

    @GetMapping("/forecast/{lat}/{longt}")
    public ResponseEntity<WeatherForecastResponse> getWeatherForecast(@PathVariable("lat") double lat, @PathVariable("longt")double longt) {
        WeatherForecastResponse weatherInfo = service.getForecastService(lat,longt);
        return new ResponseEntity<>(weatherInfo, HttpStatusCode.valueOf(200));
    }

}
