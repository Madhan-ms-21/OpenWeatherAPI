package org.openweatherapi.openweatherapi.Services;

import org.openweatherapi.openweatherapi.Models.WeatherForecastResponse;
import org.openweatherapi.openweatherapi.Models.weatherInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherServices {

    @Autowired
    RedisTemplate<String,Object> redisTemplate;

    public weatherInfo getWeatherService(double lat , double longt){
        weatherInfo weatherInfoInstance ;
        String OpenAPiWeatherUrl = "https://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+longt+"&appid=3cae1b79ef7f0cb6e8526bf151827f88";

        weatherInfoInstance = (weatherInfo) this.redisTemplate.opsForHash().get("WEATHER_INFO", "Co_Ordinates" + lat + "_" + longt);
        if(weatherInfoInstance != null) {
            System.out.println("Found the weather Info Inside  Redis" + weatherInfoInstance);
            return weatherInfoInstance;
        }
        RestTemplate restTemplate = new RestTemplate();
        weatherInfoInstance = restTemplate.getForObject(OpenAPiWeatherUrl, weatherInfo.class);
        this.redisTemplate.opsForHash().put("WEATHER_INFO", "Co_Ordinates" + lat + "_" + longt,weatherInfoInstance);
        System.out.println(weatherInfoInstance);
        return weatherInfoInstance;
    }

    public WeatherForecastResponse getForecastService(double lat , double longt){
        WeatherForecastResponse weatherInfoInstance ;
        String OpenAPiWeatherUrl = "https://api.openweathermap.org/data/2.5/forecast/?lat="+lat+"&lon="+longt+"&appid=3cae1b79ef7f0cb6e8526bf151827f88&cnt=4";
        RestTemplate restTemplate = new RestTemplate();
        weatherInfoInstance = restTemplate.getForObject(OpenAPiWeatherUrl, WeatherForecastResponse.class);
        System.out.println(weatherInfoInstance);
        return weatherInfoInstance;
    }

}
