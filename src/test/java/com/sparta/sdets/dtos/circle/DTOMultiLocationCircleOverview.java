package com.sparta.sdets.dtos.circle;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DTOMultiLocationCircleOverview {

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

    public boolean checkLocationsAreUnique(){

        ArrayList<double[]> LocationCompact= new ArrayList<>();

        for(DTOMultiLocationCircle city : this.cities){
            double[] temp = new double[2];

            temp[0] = city.getCoord().getLat();
            temp[1] = city.getCoord().getLon();

            LocationCompact.add(temp);
        }

        Set<double[]> LocationNoDuplicates = new HashSet<>(LocationCompact);

        return LocationNoDuplicates.size() >= LocationCompact.size();
    }

}
