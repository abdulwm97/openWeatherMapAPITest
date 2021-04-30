package com.sparta.sdets.util;

import com.sparta.sdets.dtos.properties.Main;
import com.sparta.sdets.dtos.properties.WeatherConditions;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Map;

public class WeatherMapAPIUtil implements WeatherMapAPIUtilIntf {

    @Override
    public boolean checkPercentageIsWithinRestraints(double percentage) {
        return percentage >= 0 && percentage <= 100;
    }

    @Override
    public boolean checkTemperatureIsWithinRestraints(double temp, double min, double max) {
        return (temp >= min) && (temp <= max);
    }

    @Override
    public boolean checkTemperatureMinIsLessThanMax(double min, double max) {
        return min <= max;
    }

    @Override
    public boolean checkDateTimeIsLessThanCurrentTime(int dateTime) {
        long currentTimestamp = Instant.now().toEpochMilli() / 1000;
        return dateTime < currentTimestamp;
    }

    public boolean checkWeatherConditionIsValid(String weather){

        Map<Integer, ArrayList> weatherConditions = WeatherConditions.loadWeatherConditions();
        for(ArrayList arrayList: weatherConditions.values()){
            if(weather.equals(arrayList.get(0))){
                return true;
            }
        }
        return false;

    }
}
