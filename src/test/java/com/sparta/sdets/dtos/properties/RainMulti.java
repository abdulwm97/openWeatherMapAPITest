package com.sparta.sdets.dtos.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RainMulti
{

    @JsonProperty("3h")
    private double threeHours;

    public void setThreeHours(double threeHours){
        this.threeHours = threeHours;
    }
    public double getThreeHours(){
        return this.threeHours;
    }
}
