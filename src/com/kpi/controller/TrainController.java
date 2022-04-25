package com.kpi.controller;
import com.kpi.model.Time;
import com.kpi.model.Train;
import com.kpi.model.TrainModel;
import com.kpi.view.InputView;
import com.kpi.view.TrainView;

import java.util.ArrayList;

public class TrainController {

    private final TrainModel model;
    private final TrainView view;
    private final InputView input;

    public TrainController() {
        this.model = new TrainModel();
        this.view = new TrainView();
        this.input = new InputView(view);
    }

    public void run() {
        int indexOfCommand = 0;
        ArrayList<Train> resultList = new ArrayList<>();
        while (true) {
            try {
                indexOfCommand = input.inputIntValueWithScanner();
                if (indexOfCommand == 3) {
                    break;
                } else if (indexOfCommand == 1) {
                    resultList = model.getBySeatsType();
                } else if (indexOfCommand == 2) {
                    String destinationPlace = input.inputCity();
                    Time timeAfter = input.inputTime();
                    resultList = model.getByDeparturePlaceAndAfterTime(destinationPlace, timeAfter);
                }
                view.printResultAndMessage(view.RESULT, resultList);
            } catch (Exception ex) {
                view.printMessage(ex.getMessage());
            }
        }
    }


}
