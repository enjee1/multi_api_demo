package com.careerdevs.Multi_API;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Weather {
    private long timezone;
    private int id;
    private String name;

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
}
