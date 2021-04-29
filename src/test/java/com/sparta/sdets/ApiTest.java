package com.sparta.sdets;

import com.sparta.sdets.openweatherdtos.DTOMultiLocationQryOverviewImpl;
import com.sparta.sdets.openweatherdtos.DTOSingleLocationQry;
import org.junit.jupiter.api.BeforeAll;

public class ApiTest {

    private static DTOSingleLocationQry dtoSingleLocationQry;
    private static DTOMultiLocationQryOverviewImpl dtoMultiLocationQryOverview;

    @BeforeAll
    static void setup(){
        dtoSingleLocationQry = Injector.injectDTO2(ConnectionManager.getConnection("single"));
        dtoMultiLocationQryOverview = Injector.injectDTO1(ConnectionManager.getConnection("multiple"));
    }
}
