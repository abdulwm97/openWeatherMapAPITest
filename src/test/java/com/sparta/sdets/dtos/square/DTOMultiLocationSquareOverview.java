package com.sparta.sdets.dtos.square;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DTOMultiLocationSquareOverview {

    @JsonProperty("cod")
    private String statusCode;

    @JsonProperty("calctime")
    private Float calcTime;

    @JsonProperty("cnt")
    private Integer numOfCitiesInBox;

    @JsonProperty("list")
    private ArrayList<DTOMultiLocationSquare> cities;

    public DTOMultiLocationSquareOverview(){

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

    public ArrayList<DTOMultiLocationSquare> getCities() {
        return cities;
    }

    public void setCities(ArrayList<DTOMultiLocationSquare> cities) {
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

    public boolean checkLocationsAreUnique(){

        ArrayList<double[]> LocationCompact= new ArrayList<>();

        for(DTOMultiLocationSquare city : this.cities){
            double[] temp = new double[2];

            temp[0] = city.getCoord().getLat();
            temp[1] = city.getCoord().getLon();

            LocationCompact.add(temp);
        }

        Set<double[]> LocationNoDuplicates = new HashSet<>(LocationCompact);

        return LocationNoDuplicates.size() >= LocationCompact.size();
    }

}
