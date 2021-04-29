package com.sparta.sdets.openweatherdtos;


public interface DTOCityQry {

    boolean checkCoordinatesWithinRestraints(double lon, double lat);
    boolean checkNullOrEmpty(Object variable);
    boolean checkPercentageWithinRestraints(int percentage);
    boolean checkPercentageWithinRestraints(double percentage);
    boolean checkTemperatureWithinRestraints(double temp, double min, double max);
    boolean checkTemperatureMinLessThanMax(double min, double max);
    boolean checkSunriseTimeLessThanSunsetTime(int Sunrise, int Sunset);

}
