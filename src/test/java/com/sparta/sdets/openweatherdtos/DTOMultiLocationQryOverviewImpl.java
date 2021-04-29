package com.sparta.sdets.openweatherdtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.stream.Location;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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

        ArrayList<double[]> LocationCompact= new ArrayList<>();

        for(DTOMultiLocationQryImpl city : cities){
            double[] temp = new double[2];

            temp[0] = city.getCoord().getLat();
            temp[1] = city.getCoord().getLon();

            LocationCompact.add(temp);
        }

        Set<double[]> LocationNoDuplicates = new HashSet<>(LocationCompact);

        if(LocationNoDuplicates.size() < LocationNoDuplicates.size()){
            return false;
        }
        else{
            return true;
        }
    }
}
