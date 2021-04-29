package com.sparta.sdets.dtos.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Wind
{
    @JsonProperty("speed")
    private double speed;

    @JsonProperty("deg")
    private double deg;

    public void setSpeed(double speed){
        this.speed = speed;
    }
    public double getSpeed(){
        return this.speed;
    }
    public void setDeg(double deg){
        this.deg = deg;
    }
    public double getDeg(){
        return this.deg;
    }
}
