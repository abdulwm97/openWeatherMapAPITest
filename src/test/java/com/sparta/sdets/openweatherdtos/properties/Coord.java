package com.sparta.sdets.openweatherdtos.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coord
{
    @JsonProperty("lon")
    private double lon;

    @JsonProperty("lat")
    private double lat;

    public void setLon(double lon){
        this.lon = lon;
    }
    public double getLon(){
        return this.lon;
    }
    public void setLat(double lat){
        this.lat = lat;
    }
    public double getLat(){
        return this.lat;
    }
}