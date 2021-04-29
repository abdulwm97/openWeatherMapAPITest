package com.sparta.sdets.queries;

import com.sparta.sdets.queries.interfaces.SingleLocationQry;

import java.time.Instant;

public class SingleLocationQueries implements SingleLocationQry {

    @Override
    public boolean checkCoordinatesWithinRestraints(double lon, double lat) {
        return lon >= -180.0000000 && lon <= 180.0000000 && lat >= -90.0000000 && lat <= 90.0000000;
    }

    @Override
    public boolean checkNullOrEmpty(Object variable) {
        return variable == "" || variable == null;
    }

    @Override
    public boolean checkPercentageWithinRestraints(double percentage) {
        return percentage >= 0 && percentage <= 100;
    }

    @Override
    public boolean checkTemperatureWithinRestraints(double temp, double min, double max) {
        return (temp >= min) && (temp <= max);
    }

    @Override
    public boolean checkTemperatureMinLessThanMax(double min, double max) {
        return min <= max;
    }

    @Override
    public boolean checkSunriseTimeLessThanSunsetTime(int sunrise, int sunset) {
        return sunrise < sunset;
    }

    @Override
    public boolean checkDtLessThanCurrentTime(int dateTime) {
        long currentTimestamp = Instant.now().toEpochMilli() / 1000;
        return dateTime < currentTimestamp;
    }
}
