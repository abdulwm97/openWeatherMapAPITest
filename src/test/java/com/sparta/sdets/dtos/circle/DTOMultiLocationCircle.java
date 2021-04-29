package com.sparta.sdets.dtos.circle;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sparta.sdets.dtos.properties.*;

import java.util.List;

public class DTOMultiLocationCircle {

    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("coord")
    private Coord coord;

    @JsonProperty("main")
    private Main main;

    @JsonProperty("dt")
    private int dt;

    @JsonProperty("wind")
    private Wind wind;

    @JsonProperty("sys")
    private SystemMulti system;

    @JsonProperty("rain")
    private Rain rain;

    @JsonProperty("snow")
    private Snow snow;

    @JsonProperty("clouds")
    private Clouds clouds;

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

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public Coord getCoord() {
        return this.coord;
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

    public SystemMulti getSystem() {
        return system;
    }

    public void setSystem(SystemMulti system) {
        this.system = system;
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

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Clouds getClouds() {
        return this.clouds;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public List<Weather> getWeather() {
        return this.weather;
    }

    public boolean checkCoordinatesAreWithinRestraints() {
        return coord.getLon() >= -180.0000000 && coord.getLon() <= 180.0000000 && coord.getLat() >= -90.0000000 && coord.getLat() <= 90.0000000;
    }

}

