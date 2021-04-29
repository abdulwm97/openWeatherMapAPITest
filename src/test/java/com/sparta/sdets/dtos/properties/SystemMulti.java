package com.sparta.sdets.dtos.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SystemMulti {

    @JsonProperty("country")
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
