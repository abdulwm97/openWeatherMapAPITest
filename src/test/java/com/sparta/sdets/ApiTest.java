package com.sparta.sdets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.sdets.openweatherdtos.DTOMultCityQry;
import com.sparta.sdets.openweatherdtos.DTOMultCityQryOverview;
import com.sparta.sdets.openweatherdtos.DTOSingCityQry;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URL;

public class ApiTest {

    private static ObjectMapper objectMapper;
    private static DTOSingCityQry dtoMultCityQry;

    @BeforeAll
    static void setup(){
        objectMapper = new ObjectMapper();
        try {
            dtoMultCityQry = objectMapper.readValue(new URL(ConnectionManager.getConnection()),DTOSingCityQry.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("test123")
    void test123() {
        System.out.println(dtoMultCityQry.getClouds().getAll());
    }


}
