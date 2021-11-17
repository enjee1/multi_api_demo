package com.careerdevs.Multi_API.weather;

import com.careerdevs.Multi_API.weather.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private Environment env;

    @GetMapping("/")
    public Weather weatherInfo(RestTemplate restTemplate) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=Boston&appid=" + env.getProperty("weather.key");
        Weather weather = restTemplate.getForObject(url, Weather.class);

        return weather;
    }
}
