package com.sparta.sdets.dtos.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain
{
    @JsonProperty("1h")
    private double oneHours;


    public double getOneHours() {
        return oneHours;
    }

    public void setOneHours(double oneHours) {
        this.oneHours = oneHours;
    }

}
