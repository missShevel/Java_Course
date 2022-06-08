package com.kpi.view;

import com.kpi.model.entities.Train;

import java.util.ArrayList;

public class MainView {

    public final String INPUT_MESSAGE = "Please, choose the option: " +
            "\n 1 - Print trains with certain type of places" +
            "\n 2 - Print trains going to certain destination and deporting after certain time" +
            "\n 3 - Exit";

    public final String HEADER =
          "+----------------------------------------+-------------+--------+--------------------+--------------------+--------------------+--------------------+" +
        "\n|               Train ID                 | Destination |  Time  |    General seats   |   Reserved Seats   |     Coupe Seats    | Sleep Vagon Seats  |" +
        "\n+----------------------------------------+-------------+--------+--------------------+--------------------+--------------------+--------------------+" +
        "\n";
    public final String FOOTER = "+----------------------------------------+-------------+--------+--------------------+--------------------+--------------------+--------------------+\n";
    public final String ENTER_DESTINATION = "Enter destination name: ";
    public final String ENTER_TIME = "Enter time in format \"HH:MM\": ";
    public final String ENTER_PLACES_TYPE = "Enter places type: ";

    public final String RESULT = "Here is the list of trains";
    public final String EMPTY_RESULT = "No trains found";
    public final String WRONG_INPUT = "Wrong input! Try again";

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public String getResult(ArrayList<Train> trains) {
        StringBuilder stb = new StringBuilder();
        stb.append(HEADER);
        for (Train t : trains) {
            stb.append(t.toString() + "\n");
        }
        stb.append(FOOTER);
    return stb.toString();
    }
    public void printResultAndMessage(String message, ArrayList<Train> result){
        printMessage(message);
        printMessage(getResult(result));
    }
}
