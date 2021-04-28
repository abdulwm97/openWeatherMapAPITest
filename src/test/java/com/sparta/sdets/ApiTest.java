package com.sparta.sdets;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    @DisplayName("test123")
    void test123() {
        System.out.println(ConnectionManager.getConnection());
    }


}
