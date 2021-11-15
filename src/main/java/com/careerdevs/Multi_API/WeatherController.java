package com.careerdevs.Multi_API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {

    private static final String MY_API_KEY = "36d71f362c228bcb87f66c294dc7dc1c";
    @GetMapping("/weather")
    public Weather weatherInfo(RestTemplate restTemplate) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=Boston&appid=" + MY_API_KEY;
        Weather weather = restTemplate.getForObject(url, Weather.class);

        return weather;
    }
}
