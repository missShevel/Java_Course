package com.kpi.controller;

import com.kpi.model.Solution;
import com.kpi.model.entities.Time;
import com.kpi.model.entities.Train;
import com.kpi.model.utilities.DataHelper;
import com.kpi.model.utilities.TrainsTimetable;
import com.kpi.view.InputView;
import com.kpi.view.MainView;
import com.kpi.view.UserSaveView;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.File;
import java.util.ArrayList;

public class MainController {

    private final Solution solution;
    private final MainView view;
    private final InputView input;
    public static final String FILE_PATH = "src/main/resources/";
    private static final Logger logger = LogManager.getLogger(MainController.class);

    public MainController() {
        this.solution = new Solution();
        this.view = new MainView();
        this.input = new InputView(view);
        logger.info("Application started.");
    }

    public void run() {
        int indexOfCommand = 0;
        ArrayList<Train> resultList = new ArrayList<>();
        DataHelper file = new DataHelper();
        while (true) {
            try {
                indexOfCommand = input.inputIntValueWithScanner();
                if (indexOfCommand == 3) {
                    resultList = new TrainsTimetable().getTimetable();
                    file.saveData(resultList);
                    logger.info("Application closed successfully");
                    break;
                } else if (indexOfCommand == 1) {
                    resultList = solution.getBySeatsType();
                    if(resultList.isEmpty()){
                        view.printMessage(view.EMPTY_RESULT);
                    } else {
                        view.printResultAndMessage(view.RESULT, resultList);
                        if (UserSaveView.saveMenu()) {
                            file.saveData(view.getResult(resultList), FILE_PATH + input.inputFileName());
                        }
                    }
                } else if (indexOfCommand == 2) {
                    String destinationPlace = input.inputCity();
                    Time timeAfter = input.inputTime();
                    resultList = solution.getByDeparturePlaceAndAfterTime(destinationPlace, timeAfter);
                    if (resultList.isEmpty()) {
                        view.printMessage(view.EMPTY_RESULT);
                    } else {
                        view.printResultAndMessage(view.RESULT, resultList);
                        if (UserSaveView.saveMenu()) {
                            file.saveData(view.getResult(resultList), FILE_PATH + input.inputFileName());
                        }
                    }
                }
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
                view.printMessage(e.getMessage());
            }
        }
    }


}
