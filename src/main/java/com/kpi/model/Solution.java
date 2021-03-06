package com.kpi.model;

import com.kpi.model.entities.Time;
import com.kpi.model.entities.Train;
import com.kpi.model.utilities.TrainsTimetable;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Solution {

    private static TrainsTimetable timetable;

    public Solution() {
        this.timetable = new TrainsTimetable();
    }

    public ArrayList<Train> getBySeatsType()  {
        return timetable.getTimetable()
                               .stream()
                               .filter(train -> train.getNumberOfGeneralSeats() > 0)
                               .collect(Collectors.toCollection(ArrayList::new));

    }

    public ArrayList<Train> getByDeparturePlaceAndAfterTime(String place, Time time) {
        return timetable.getTimetable()
                .stream()
                .filter(train -> train.getDestination().equals(place) && Time.isGreater(time, train.getTime()))
                .collect(Collectors.toCollection(ArrayList::new));

    }

    public TrainsTimetable getTimetable(){
        return this.timetable;
    }

}
