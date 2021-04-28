package com.sparta.sdets.openweatherdtos.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Main
{
    @JsonProperty("temp")
    private double temp;

    @JsonProperty("temp_min")
    private double tempMin;

    @JsonProperty("temp_max")
    private double tempMax;

    @JsonProperty("pressure")
    private double pressure;

    @JsonProperty("feels_like")
    private double feelsLike;

    @JsonProperty("sea_level")
    private double seaLevel;

    @JsonProperty("grnd_level")
    private double groundLevel;

    @JsonProperty("humidity")
    private int humidity;

    public void setTemp(double temp){
        this.temp = temp;
    }
    public double getTemp(){
        return this.temp;
    }
    public void setTempMin(double tempMin){
        this.tempMin = tempMin;
    }
    public double getTempMin(){
        return this.tempMin;
    }
    public void setTempMax(double tempMax){
        this.tempMax = tempMax;
    }
    public double getTempMax(){
        return this.tempMax;
    }
    public void setPressure(double pressure){
        this.pressure = pressure;
    }
    public double getPressure(){
        return this.pressure;
    }

    public double getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(double seaLevel) {
        this.seaLevel = seaLevel;
    }

    public double getGroundLevel() {
        return groundLevel;
    }

    public void setGroundLevel(double groundLevel) {
        this.groundLevel = groundLevel;
    }

    public void setFeelsLike(double feelsLike){
        this.feelsLike = feelsLike;
    }
    public double getFeelsLike(){
        return this.feelsLike;
    }
    public void setHumidity(int humidity){
        this.humidity = humidity;
    }
    public int getHumidity(){
        return this.humidity;
    }
}

