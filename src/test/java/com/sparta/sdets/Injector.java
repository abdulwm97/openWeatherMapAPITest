package com.sparta.sdets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.sdets.openweatherdtos.DTOMultCityQryOverview;
import com.sparta.sdets.openweatherdtos.DTOSingCityQry;

import java.io.IOException;
import java.net.URL;

public class Injector {
    public static DTOMultCityQryOverview injectDTO1(String url) {
        DTOMultCityQryOverview dtoMultCityQryOverview = new DTOMultCityQryOverview();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            dtoMultCityQryOverview = objectMapper.readValue(new URL(url), DTOMultCityQryOverview.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dtoMultCityQryOverview;
    }

    public static DTOSingCityQry injectDTO2(String url) {
        DTOSingCityQry dtoSingCityQry = new DTOSingCityQry();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            dtoSingCityQry = objectMapper.readValue(new URL(url), DTOSingCityQry.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dtoSingCityQry;
    }
}