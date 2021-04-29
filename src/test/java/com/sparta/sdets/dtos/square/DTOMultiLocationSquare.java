package com.sparta.sdets.dtos.square;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sparta.sdets.dtos.properties.*;

import java.util.List;

public class DTOMultiLocationSquare {

    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("coord")
    private CoordMulti coordMulti;

    @JsonProperty("main")
    private Main main;

    @JsonProperty("dt")
    private int dt;

    @JsonProperty("wind")
    private Wind wind;

    @JsonProperty("rain")
    private Rain rain;

    @JsonProperty("snow")
    private Snow snow;

    @JsonProperty("clouds")
    private CloudsMulti cloudsMulti;

    @JsonProperty("visibility")
    private int visibility;

    @JsonProperty("weather")
    private List<Weather> weather;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCoord(CoordMulti coordMulti) {
        this.coordMulti = coordMulti;
    }

    public CoordMulti getCoord() {
        return this.coordMulti;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Main getMain() {
        return this.main;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public int getDt() {
        return this.dt;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Wind getWind() {
        return this.wind;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    public Rain getRain() {
        return this.rain;
    }

    public Snow getSnow() {
        return snow;
    }

    public void setSnow(Snow snow) {
        this.snow = snow;
    }

    public void setClouds(CloudsMulti cloudsMulti) {
        this.cloudsMulti = cloudsMulti;
    }

    public CloudsMulti getClouds() {
        return this.cloudsMulti;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public List<Weather> getWeather() {
        return this.weather;
    }

    public boolean checkCoordinatesAreWithinRestraints() {
        return coordMulti.getLon() >= -180.0000000 && coordMulti.getLon() <= 180.0000000 && coordMulti.getLat() >= -90.0000000 && coordMulti.getLat() <= 90.0000000;
    }

}
