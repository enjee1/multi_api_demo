package com.careerdevs.Multi_API.weather;

import com.fasterxml.jackson.annotation.JsonInclude;
import net.minidev.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Weather {
    private long timezone;
    private int id;
    private String name;
    private HashMap<String, Double> main;

    public long getTimezone() {
        return timezone;
    }

    public void setTimezone(long timezone) {
        this.timezone = timezone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Double> getMain() {
        return main;
    }

    public void setMain(HashMap<String, Double> main) {
        this.main = main;
    }


}
