package com.kpi.controller;

import com.kpi.model.Solution;
import com.kpi.model.entities.Time;
import com.kpi.model.entities.Train;
import com.kpi.model.utilities.DataHelper;
import com.kpi.view.InputView;
import com.kpi.view.MainView;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class MainController {

    private final Solution solution;
    private final MainView view;
    private final InputView input;
    private static final Logger logger = LogManager.getLogger(MainController.class);

    public MainController() {
        this.solution = new Solution();
        this.view = new MainView();
        this.input = new InputView(view);
        logger.info("Initialization started.");
    }

    public void run() {
        int indexOfCommand = 0;

        ArrayList<Train> resultList = solution.getTimetable().getTrainStorage();

        while (true) {
            try {
                indexOfCommand = input.inputIntValueWithScanner();
                if (indexOfCommand == 3) {
                    DataHelper file = new DataHelper();
                    file.saveData(resultList);
                    break;
                } else if (indexOfCommand == 1) {
                    resultList = solution.getBySeatsType();
                } else if (indexOfCommand == 2) {
                    String destinationPlace = input.inputCity();
                    Time timeAfter = input.inputTime();
                    resultList = solution.getByDeparturePlaceAndAfterTime(destinationPlace, timeAfter);
                }
                view.printResultAndMessage(view.RESULT, resultList);
            } catch (Exception ex) {
                view.printMessage(ex.getMessage());
            }
        }
    }


}
