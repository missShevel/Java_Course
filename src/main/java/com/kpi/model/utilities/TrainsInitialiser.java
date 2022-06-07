package com.kpi.model.utilities;

import com.kpi.model.entities.Train;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class TrainsInitialiser {
    private ArrayList<Train> trains;

    public TrainsInitialiser() {
        this.trains = loadTrains();
        }

    private static ArrayList<Train> loadTrains() {
        ArrayList<Train> trains = new DataHelper().loadData();
        if (trains==null || trains.isEmpty()) trains = generateTrains(20);
        return trains;
    }

    private static ArrayList<Train> generateTrains(int number) {
        ArrayList<Train> trains = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            Train t = new Train(generateDestination(), UUID.randomUUID().toString(), generateNumber(23), generateNumber(59), generateNumber(80), generateNumber(15), generateNumber(16), generateNumber(10));
            trains.add(t);
            System.out.println(t);
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
        return rand.nextInt(maxValue) + 1;
    }

    public ArrayList<Train> getTrainStorage() {
        return this.trains;
    }

}
