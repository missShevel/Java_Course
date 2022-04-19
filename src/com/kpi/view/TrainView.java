package com.kpi.view;
import com.kpi.model.Train;

import java.util.ArrayList;

public class TrainView {

    public final String INPUT_MESSAGE = "Please, choose the option: " +
            "\n 1 - Print trains with certain type of places" +
            "\n 2 - Print trains going to certain destination and deporting after certain time" +
            "\n 3 - Exit";

    public final String ENTER_DESTINATION = "Enter destination name: ";
    public final String ENTER_TIME = "Enter time in format \"HH:MM\": ";
    public final String ENTER_PLACES_TYPE = "Enter places type: ";

    public final String RESULT = "Here is the list of trains";
    public final String EMPTY_RESULT = "No trains found";
    public final String WRONG_INPUT = "Wrong input! Try again";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printResultAndMessage(String message, ArrayList<Train> trains){
        System.out.println(message);
        System.out.format("+----------------------------------------+-------------+--------+--------------------+--------------------+--------------------+--------------------+\n");
        System.out.format("|               Train ID                 | Destination |  Time  |    General seats   |   Reserved Seats   |     Coupe Seats    | Sleep Vagon Seats  |\n");
        System.out.format("+----------------------------------------+-------------+--------+--------------------+--------------------+--------------------+--------------------+\n");

        for(Train t : trains) {
            System.out.println(t);
        }
        System.out.format("+----------------------------------------+-------------+--------+--------------------+--------------------+--------------------+--------------------+\n");
    }
}
