package com.kpi.model;

import java.util.ArrayList;

import com.kpi.exceptions.EmptyResultException;

public class TrainModel {

    TrainStorage DB;

    public TrainModel() {
        this.DB = new TrainStorage();
    }
//    public Train [] getByDepartureTime() {
//        return new Train[0];
//    }

    public ArrayList<Train> getBySeatsType() throws EmptyResultException {
        ArrayList<Train> foundTrains = new ArrayList<>();
        for (Train t : DB.getTrainStorage()) {
            if (t.getNumberOfGeneralSeats() > 0) {
                foundTrains.add(t);
            }
        }
        ResultValidator.checkEmptyResult(foundTrains);
        return foundTrains;
    }

    public ArrayList<Train> getByDeparturePlaceAndAfterTime(String place, Time time) throws EmptyResultException {
        ArrayList<Train> foundTrains = new ArrayList<>();
        for (Train t : DB.getTrainStorage()) {
            if (t.getDestination().equals(place) && Time.isGreater(time, t.getTime())) {
                foundTrains.add(t);
            }
        }
        ResultValidator.checkEmptyResult(foundTrains);
        return foundTrains;
    }

}
