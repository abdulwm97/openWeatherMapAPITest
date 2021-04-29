package com.sparta.sdets.util;


public interface WeatherMapAPIUtilIntf {

    boolean checkPercentageIsWithinRestraints(double percentage);
    boolean checkTemperatureIsWithinRestraints(double temp, double min, double max);
    boolean checkTemperatureMinIsLessThanMax(double min, double max);
    boolean checkDateTimeIsLessThanCurrentTime(int dateTime);

}
