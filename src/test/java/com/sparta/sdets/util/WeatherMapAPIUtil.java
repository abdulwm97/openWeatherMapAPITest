package com.sparta.sdets.util;

import java.time.Instant;

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
}
