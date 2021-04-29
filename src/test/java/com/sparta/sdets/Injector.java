package com.sparta.sdets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.sdets.openweatherdtos.DTOMultiLocationQryOverviewImpl;
import com.sparta.sdets.openweatherdtos.DTOSingleLocationQry;

import java.io.IOException;
import java.net.URL;

public class Injector {
    public static DTOMultiLocationQryOverviewImpl injectDTO1(String url) {
        DTOMultiLocationQryOverviewImpl dtoMultCityQryOverview = new DTOMultiLocationQryOverviewImpl();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            dtoMultCityQryOverview = objectMapper.readValue(new URL(url), DTOMultiLocationQryOverviewImpl.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dtoMultCityQryOverview;
    }

    public static DTOSingleLocationQry injectDTO2(String url) {
        DTOSingleLocationQry dtoSingCityQry = new DTOSingleLocationQry();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            dtoSingCityQry = objectMapper.readValue(new URL(url), DTOSingleLocationQry.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dtoSingCityQry;
    }
}