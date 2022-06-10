package com.kpi.model.utilities;

import com.kpi.model.entities.Train;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class TrainsTimetable {
    private ArrayList<Train> trains;

    public TrainsTimetable() {
        this.trains = loadTimetable();
        }

    private static ArrayList<Train> loadTimetable() {
        ArrayList<Train> trains = new DataHelper().loadData();
        if (trains == null || trains.isEmpty()) trains = generateTimetable(20);
        return trains;
    }

    private static ArrayList<Train> generateTimetable(int number) {
        ArrayList<Train> trains = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            Train t = new Train(generateDestination(), UUID.randomUUID().toString(), generateNumber(23), generateNumber(59), generateNumber(20)-1, generateNumber(15), generateNumber(16), generateNumber(10));
            trains.add(t);
        }
        return trains;
    }

    private static String generateDestination() {
        String[] destinations = {"Kyiv", "Zhytomyr", "Kharkiv", "Sumy", "Poltava", "Mykolaiv", "Odesa", "Donetsk", "Lviv", "Luhansk", "Lutsk", "Lishchyn", "Vyshneve", "Chernihiv", "Kherson"};
        int n = (int) (Math.random() * (destinations.length));
        return destinations[n];
    }

    private static int generateNumber(int maxValue) {
        Random rand = new Random();
        return rand.nextInt(maxValue);
    }

    public ArrayList<Train> getTimetable() {
        return trains;
    }

}
