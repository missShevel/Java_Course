package com.kpi.controller;

import com.kpi.model.Time;
import com.kpi.model.Train;
import com.kpi.model.TrainModel;
import com.kpi.model.TrainStorage;
import com.kpi.view.InputView;
import com.kpi.view.TrainView;

import java.util.ArrayList;
import java.util.Scanner;

public class TrainController {

    private TrainModel model;
    private TrainView view;
    private InputView input;

    public TrainController() {
        this.model = new TrainModel();
        this.view = new TrainView();
        this.input = new InputView(view);
    }

//    public String getTrainDestination() {
//        return model.getDestination();
//    }
//
//    public String getTrainIdNumber() {
//        return model.getIdNumber();
//    }
//
//    public String getDepartureTime(){
//        return model.getTime();
//    }
//
//    public int getTrainGeneralSeats() {
//        return model.getNumberOfGeneralSeats();
//    }
//
//    public int getTrainReservedSeats() {
//        return model.getNumberOfReservedSeats();
//    }
//
//    public int getCoupeSeats() {
//        return model.getNumberOfCoupeSeats();
//    }
//
//    public int getNumberOfSVSeats() {
//        return model.getNumberOfSVSeats();
//    }

    public void run() {

        int indexOfCommand = 5;
        ArrayList<Train> resultList = new ArrayList<>();
        do {
            try {
                indexOfCommand = input.inputIntValueWithScanner();
                if (indexOfCommand == 1) {
                    resultList = model.getBySeatsType();
                    view.printResultAndMessage(view.RESULT, resultList);
                } else if (indexOfCommand == 2) {
                    String destinationPlace = input.inputCity();
                    Time timeAfter = input.inputTime();
                    resultList = model.getByDeparturePlaceAndAfterTime(destinationPlace, timeAfter);
                    view.printResultAndMessage(view.RESULT, resultList);

                }
            }
            catch (IncorrectInputException ex) {
                view.printMessage(view.WRONG_INPUT);
            }
        }
        while (indexOfCommand != 3);
    }

}
