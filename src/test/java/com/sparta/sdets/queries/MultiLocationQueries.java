package com.sparta.sdets.queries;

import com.sparta.sdets.dtos.square.DTOMultiLocationSquare;
import com.sparta.sdets.queries.interfaces.MultiLocationQryOverview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MultiLocationQueries extends SingleLocationQueries implements MultiLocationQryOverview  {

    @Override
    public boolean checkLocationUniqueness(ArrayList<DTOMultiLocationSquare> cities){

        ArrayList<double[]> LocationCompact= new ArrayList<>();

        for(DTOMultiLocationSquare city : cities){
            double[] temp = new double[2];

            temp[0] = city.getCoord().getLat();
            temp[1] = city.getCoord().getLon();

            LocationCompact.add(temp);
        }

        Set<double[]> LocationNoDuplicates = new HashSet<>(LocationCompact);

        return LocationNoDuplicates.size() >= LocationCompact.size();
    }

}
