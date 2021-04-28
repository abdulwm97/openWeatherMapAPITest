package com.sparta.sdets;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.sdets.openweatherdtos.DTOOne;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ApiTest {
    private DTOOne dtoOne;
    private ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    void setup(){
        try {
            dtoOne = objectMapper.readValue(new URL(""),DTOOne.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
