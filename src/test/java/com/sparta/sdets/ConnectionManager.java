package com.sparta.sdets;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;
import java.util.Locale;
import java.util.Properties;

public class ConnectionManager {
    private static final String BASEURL = "https://api.openweathermap.org/";
    private static String endPoint;

    static Properties properties;

    public static String getConnection(String connectionType) {
        String inputFile = "src/test/resources/application.properties";
        Properties properties = new Properties();

        connectionType = connectionType.toLowerCase(Locale.ROOT);

        if(connectionType.equals("single")){
            endPoint = "data/2.5/weather?q=london&appid=";
        }
        else if(connectionType.equals("multiple")){
            endPoint = "data/2.5/box/city?bbox=12,32,15,37,10&appid=";
        }

        try {
            properties.load(new java.io.FileReader(inputFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return BASEURL + endPoint + properties.getProperty("apiKey");
    }

    public static int getStatusCode() {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(BASEURL + endPoint + properties.getProperty("apiKey"))).build();
        int statusCode = 0;
        try {
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            statusCode = httpResponse.statusCode();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return statusCode;
    }
}

