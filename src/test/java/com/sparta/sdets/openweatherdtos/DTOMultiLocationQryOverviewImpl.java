package com.sparta.sdets.openweatherdtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class DTOMultiLocationQryOverviewImpl implements DTOMultiLocationQryOverview{

    @JsonProperty("cod")
    private String statusCode;

    @JsonProperty("calctime")
    private Float calcTime;

    @JsonProperty("cnt")
    private Integer numOfCitiesInBox;

    @JsonProperty("list")
    private ArrayList<DTOMultiLocationQryImpl> cities;

    public DTOMultiLocationQryOverviewImpl(){

    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Float getCalcTime() {
        return calcTime;
    }

    public void setCalcTime(Float calcTime) {
        this.calcTime = calcTime;
    }

    public Integer getNumOfCitiesInBox() {
        return numOfCitiesInBox;
    }

    public void setNumOfCitiesInBox(Integer numOfCitiesInBox) {
        this.numOfCitiesInBox = numOfCitiesInBox;
    }

    public ArrayList<DTOMultiLocationQryImpl> getCities() {
        return cities;
    }

    public void setCities(ArrayList<DTOMultiLocationQryImpl> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "DTOMultCityQryOverview{" +
                "statusCode='" + statusCode + '\'' +
                ", calcTime=" + calcTime +
                ", numOfCitiesInBox=" + numOfCitiesInBox +
                ", cities=" + cities +
                '}';
    }

    @Override
    public boolean checkLocationUniqueness(ArrayList<DTOMultiLocationQryImpl> cities){
        return true;    //TODO
    }


}
