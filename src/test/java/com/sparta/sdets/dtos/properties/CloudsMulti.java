package com.sparta.sdets.dtos.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CloudsMulti
{
    @JsonProperty("today")
    private int today;

    public void setToday(int today){
        this.today = today;
    }
    public int getToday(){
        return this.today;
    }
}