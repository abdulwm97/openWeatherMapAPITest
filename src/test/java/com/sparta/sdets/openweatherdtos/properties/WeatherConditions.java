package com.sparta.sdets.openweatherdtos.properties;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class WeatherConditions {

    public static HashMap<Integer, ArrayList> weatherConditions = new HashMap<>();

    public static HashMap<Integer, ArrayList> loadWeatherConditions(){
        try (BufferedReader br = new BufferedReader(new FileReader("src/test/resources/weather.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parameters = line.split(",");
                ArrayList weatherArray = new ArrayList();
                weatherArray.add(parameters[1]);
                weatherArray.add(parameters[2]);
                weatherArray.add(parameters[3]);
                weatherArray.add(parameters[4]);
                weatherConditions.put(Integer.parseInt(parameters[0]), weatherArray);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return weatherConditions;
    }
}
