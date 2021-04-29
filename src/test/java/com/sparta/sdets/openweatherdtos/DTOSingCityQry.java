package com.sparta.sdets.openweatherdtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sparta.sdets.openweatherdtos.properties.*;
import com.sparta.sdets.openweatherdtos.properties.System;

import java.util.List;

public class DTOSingCityQry extends DTOCityQryImpl{

    @JsonProperty("coord")
    private Coord coord;

    @JsonProperty("weather")
    private List<Weather> weather;

    @JsonProperty("base")
    private String base;

    @JsonProperty("main")
    private Main main;

    @JsonProperty("visibility")
    private Integer visibility;

    @JsonProperty("wind")
    private Wind wind;

    @JsonProperty("rain")
    private Rain rain;

    @JsonProperty("clouds")
    private Clouds clouds;

    @JsonProperty("dt")
    private Integer dt;

    @JsonProperty("sys")
    private System sys;

    @JsonProperty("timezone")
    private Integer timezone;

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("cod")
    private Integer cod;


    public DTOSingCityQry() {


    }


    public Coord getCoord() {

        return coord;

    }


    public void setCoord(Coord coord) {

        this.coord = coord;

    }


    public List<Weather> getWeather() {

        return weather;

    }


    public void setWeather(List<Weather> weather) {

        this.weather = weather;

    }


    public String getBase() {

        return base;

    }


    public void setBase(String base) {

        this.base = base;

    }


    public Main getMain() {

        return main;

    }


    public void setMain(Main main) {

        this.main = main;

    }


    public Integer getVisibility() {

        return visibility;

    }


    public void setVisibility(Integer visibility) {

        this.visibility = visibility;

    }


    public Wind getWind() {

        return wind;

    }


    public void setWind(Wind wind) {

        this.wind = wind;

    }


    public Clouds getClouds() {

        return clouds;

    }


    public void setClouds(Clouds clouds) {

        this.clouds = clouds;

    }


    public Integer getDt() {

        return dt;

    }


    public void setDt(Integer dt) {

        this.dt = dt;

    }


    public System getSys() {

        return sys;

    }


    public void setSys(System sys) {

        this.sys = sys;

    }

    public Rain getRain() {
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    public Integer getTimezone() {

        return timezone;

    }



    public void setTimezone(Integer timezone) {

        this.timezone = timezone;

    }


    public Integer getId() {

        return id;

    }


    public void setId(Integer id) {

        this.id = id;

    }


    public String getName() {

        return name;

    }


    public void setName(String name) {

        this.name = name;

    }


    public Integer getCod() {

        return cod;

    }


    public void setCod(Integer cod) {

        this.cod = cod;

    }

}
