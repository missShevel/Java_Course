package com.kpi.model;

import com.kpi.model.entities.Time;
import com.kpi.model.entities.Train;
import com.kpi.model.exceptions.EmptyResultException;
import com.kpi.model.utilities.TrainsInitialiser;
import com.kpi.model.utilities.ResultValidator;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Solution {

    private static TrainsInitialiser timetable;

    public Solution() {
        this.timetable = new TrainsInitialiser();
    }

    public ArrayList<Train> getBySeatsType() throws EmptyResultException {
        ArrayList<Train> foundTrains = timetable.getTrainStorage()
                               .stream()
                               .filter(train -> train.getNumberOfGeneralSeats() > 0)
                               .collect(Collectors.toCollection(ArrayList::new));
        ResultValidator.checkEmptyResult(foundTrains);
        return foundTrains;
    }

    public ArrayList<Train> getByDeparturePlaceAndAfterTime(String place, Time time) throws EmptyResultException {
        ArrayList<Train> foundTrains = timetable.getTrainStorage()
                .stream()
                .filter(train -> train.getDestination().equals(place) && Time.isGreater(time, train.getTime()))
                .collect(Collectors.toCollection(ArrayList::new));
        ResultValidator.checkEmptyResult(foundTrains);
        return foundTrains;
    }

    public TrainsInitialiser getTimetable(){
        return this.timetable;
    }

}
