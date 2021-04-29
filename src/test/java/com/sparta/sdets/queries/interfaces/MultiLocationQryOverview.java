package com.sparta.sdets.queries.interfaces;

import com.sparta.sdets.dtos.square.DTOMultiLocationSquare;

import java.util.ArrayList;

public interface MultiLocationQryOverview extends SingleLocationQry{

    boolean checkLocationUniqueness(ArrayList<DTOMultiLocationSquare> cities);

}
