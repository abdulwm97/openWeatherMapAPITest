package com.sparta.sdets;

import com.sparta.sdets.dtos.circle.DTOMultiLocationCircleOverview;
import com.sparta.sdets.dtos.square.DTOMultiLocationSquareOverview;
import com.sparta.sdets.dtos.single.DTOSingleLocation;
import org.junit.jupiter.api.BeforeAll;

public class ApiTest {

    private static DTOSingleLocation dtoDTOSingleLocation;
    private static DTOMultiLocationSquareOverview dtoMultiLocationSquareOverview;
    private static DTOMultiLocationCircleOverview dtoMultiLocationCircleOverview;

    @BeforeAll
    static void setup(){
        dtoDTOSingleLocation = Injector.injectDTOSingle(ConnectionManager.getConnection("single"));
        dtoMultiLocationSquareOverview = Injector.injectDTOMultipleSquare(ConnectionManager.getConnection("multiplesquare"));
        dtoMultiLocationCircleOverview = Injector.injectDTOMultipleCircle(ConnectionManager.getConnection("multiplecircle"));
    }

}
