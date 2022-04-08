package com.kpi;

public class TrainController {

    private Train model;
    private TrainView view;

    public TrainController(Train model, TrainView view){
        this.model = model;
        this.view = view;
    }

    public String getTrainDestination() {
        return model.getDestination();
    }

    public String getTrainIdNumber() {
        return model.getIdNumber();
    }

    public String getDepartureTime(){
        return model.getTime();
    }

    public int getTrainGeneralSeats() {
        return model.getNumberOfGeneralSeats();
    }

    public int getTrainReservedSeats() {
        return model.getNumberOfReservedSeats();
    }

    public int getCoupeSeats() {
        return model.getNumberOfCoupeSeats();
    }

    public int getNumberOfSVSeats() {
        return model.getNumberOfSVSeats();
    }



}
