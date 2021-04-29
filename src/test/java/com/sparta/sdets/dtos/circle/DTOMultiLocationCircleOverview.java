package com.sparta.sdets.dtos.circle;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sparta.sdets.queries.MultiLocationQueries;
import com.sparta.sdets.dtos.square.DTOMultiLocationSquare;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DTOMultiLocationCircleOverview extends MultiLocationQueries {

    @JsonProperty("message")
    private String message;

    @JsonProperty("cod")
    private int statusCode;

    @JsonProperty("count")
    private Integer numOfCitiesInBox;

    @JsonProperty("list")
    private ArrayList<DTOMultiLocationCircle> cities;

    public DTOMultiLocationCircleOverview(){

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Integer getNumOfCitiesInBox() {
        return numOfCitiesInBox;
    }

    public void setNumOfCitiesInBox(Integer numOfCitiesInBox) {
        this.numOfCitiesInBox = numOfCitiesInBox;
    }

    public ArrayList<DTOMultiLocationCircle> getCities() {
        return cities;
    }

    public void setCities(ArrayList<DTOMultiLocationCircle> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "DTOMultiLocationCircleOverview{" +
                "message='" + message + '\'' +
                ", statusCode=" + statusCode +
                ", numOfCitiesInBox=" + numOfCitiesInBox +
                ", cities=" + cities +
                '}';
    }

}
