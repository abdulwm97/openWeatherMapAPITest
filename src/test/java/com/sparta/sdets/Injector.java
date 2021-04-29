package com.sparta.sdets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.sdets.dtos.circle.DTOMultiLocationCircleOverview;
import com.sparta.sdets.dtos.square.DTOMultiLocationSquareOverview;
import com.sparta.sdets.dtos.single.DTOSingleLocation;

import java.io.IOException;
import java.net.URL;

public class Injector {

    public static DTOSingleLocation injectDTOSingle(String url) {
        DTOSingleLocation dtoSingCityQry = new DTOSingleLocation();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            dtoSingCityQry = objectMapper.readValue(new URL(url), DTOSingleLocation.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dtoSingCityQry;
    }

    public static DTOMultiLocationSquareOverview injectDTOMultipleSquare(String url) {
        DTOMultiLocationSquareOverview dtoMultiLocationSquareOverview = new DTOMultiLocationSquareOverview();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            dtoMultiLocationSquareOverview = objectMapper.readValue(new URL(url), DTOMultiLocationSquareOverview.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dtoMultiLocationSquareOverview;
    }

    public static DTOMultiLocationCircleOverview injectDTOMultipleCircle(String url) {
        DTOMultiLocationCircleOverview dtoMultiLocationCircleOverview = new DTOMultiLocationCircleOverview();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            dtoMultiLocationCircleOverview = objectMapper.readValue(new URL(url), DTOMultiLocationCircleOverview.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dtoMultiLocationCircleOverview;
    }
}