package com.careerdevs.Multi_API.nasa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/nasa")
public class APODController {

    @Autowired
    private Environment env;

    @GetMapping("/")
    public String rootRoute() {
        return "Welcome Home!";
    }

    @GetMapping("/apodtest")
    public String apodTest() {
        return "APOD Testing";
    }

    @GetMapping("/apod")
    public APOD apodInfo(RestTemplate restTemplate) {
        String URL = "https://api.nasa.gov/planetary/apod?api_key=" + env.getProperty("nasa.key");

        APOD apod = restTemplate.getForObject(URL, APOD.class);

        return apod;
    }

    @PostMapping("/apod")
    public String postApod() {
        return "POST APOD";
    }
}