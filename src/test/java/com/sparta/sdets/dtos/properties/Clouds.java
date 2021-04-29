package com.sparta.sdets.dtos.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Clouds
{
    @JsonProperty("all")
    private int all;

    public void setAll(int all){
        this.all = all;
    }
    public int getAll(){
        return this.all;
    }
}