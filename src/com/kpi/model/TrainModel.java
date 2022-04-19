package com.kpi.model;

import java.util.ArrayList;

public class TrainModel {

    TrainStorage DB;

    public TrainModel(){
        this.DB = new TrainStorage();
    }
    public Train [] getByDepartureTime() {
        return new Train[0];
    }

    public ArrayList<Train> getBySeatsType() {
        ArrayList<Train> foundTrains = new ArrayList<>();
        for (Train t : DB.getTrainStorage()) {
            if (t.getNumberOfGeneralSeats() > 0) {
                foundTrains.add(t);
            }
        }
        return foundTrains;
    }

    public ArrayList<Train> getByDeparturePlaceAndAfterTime(String place, Time time) {
        ArrayList<Train> foundTrains = new ArrayList<>();
        for (Train t : DB.getTrainStorage()) {
            if (t.getDestination().equals(place) && Time.isGreater(time, t.getTime())) {
                foundTrains.add(t);
            }
        }
        return foundTrains;
    }

}
