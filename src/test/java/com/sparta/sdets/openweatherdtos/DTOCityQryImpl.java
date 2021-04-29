package com.sparta.sdets.openweatherdtos;

public class DTOCityQryImpl implements DTOCityQry{

    //TODO implement these so that they can be utilised by the DTOMultiCityQry and DTOSingCityQry Objects

    @Override
    public boolean checkCoordinatesWithinRestraints(double lon, double lat){
        return true;
    }

    @Override
    public boolean checkNullOrEmpty(Object variable){
        return true;
    }

    @Override
    public boolean checkPercentageWithinRestraints(int percentage){
        return true;
    }

    @Override
    public boolean checkPercentageWithinRestraints(double percentage){
        return true;
    }

    @Override
    public boolean checkTemperatureWithinRestraints(double temp, double min, double max){
        return true;
    }

    @Override
    public boolean checkTemperatureMinLessThanMax(double min, double max){
        return true;
    }

    @Override
    public boolean checkSunriseTimeLessThanSunsetTime(int Sunrise, int Sunset){
        return true;
    }
}
