package com.sparta.sdets;

import com.sparta.sdets.dtos.circle.DTOMultiLocationCircleOverview;
import com.sparta.sdets.dtos.square.DTOMultiLocationSquareOverview;
import com.sparta.sdets.dtos.single.DTOSingleLocation;
import com.sparta.sdets.util.WeatherMapAPIUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ApiTest {

    private static DTOSingleLocation singleLocation;
    private static DTOMultiLocationSquareOverview multiLocationSquareOverview;
    private static DTOMultiLocationCircleOverview multiLocationCircleOverview;
    private static WeatherMapAPIUtil weatherMapAPIUtil;

    @BeforeAll
    static void setup(){
        weatherMapAPIUtil = new WeatherMapAPIUtil();
        singleLocation = Injector.injectDTOSingle(ConnectionManager.getConnection("single"));
        multiLocationSquareOverview = Injector.injectDTOMultipleSquare(ConnectionManager.getConnection("multiplesquare"));
        multiLocationCircleOverview = Injector.injectDTOMultipleCircle(ConnectionManager.getConnection("multiplecircle"));
    }

    @Test
    @DisplayName("Uniqueness")
    void uniqueness() {
        Assertions.assertTrue(multiLocationCircleOverview.checkLocationsAreUnique());
    }

    @Test
    @DisplayName("CheckDateTimeIsWorking")
    void checkDateTimeIsWorking() {
        Assertions.assertTrue(weatherMapAPIUtil.checkDateTimeIsLessThanCurrentTime(singleLocation.getDt()));
    }

    @Test
    @DisplayName("Headers")
    void headers() {
        System.out.println(ConnectionManager.getHeadersInfo());
    }

}
