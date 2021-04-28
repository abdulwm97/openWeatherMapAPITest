package com.sparta.sdets.openweatherdtos.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather
{
    @JsonProperty("id")
    private int id;

    @JsonProperty("main")
    private String main;

    @JsonProperty("description")
    private String description;

    @JsonProperty("icon")
    private String icon;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setMain(String main){
        this.main = main;
    }
    public String getMain(){
        return this.main;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    public void setIcon(String icon){
        this.icon = icon;
    }
    public String getIcon(){
        return this.icon;
    }
}
