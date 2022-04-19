package com.kpi.model;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class TrainStorage {

    private ArrayList<Train> trains;

    public TrainStorage(){
        this.trains = generateTrains(20);
    }

    private static ArrayList<Train> generateTrains(int number){
        ArrayList<Train> trains = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Train t = new Train(generateDestination(), UUID.randomUUID().toString(),generateNumber(24), generateNumber(59),generateNumber(80), generateNumber(15), 16, generateNumber(10));
            trains.add(t);
            System.out.println(t);
        }
        return trains;
    }

    private static String generateDestination(){
        String [] destinations = {"Kyiv", "Zhytomyr", "Kharkiv", "Sumy", "Poltava", "Mykolaiv", "Odesa", "Donetsk", "Lviv", "Luhansk","Lutsk", "Lishchyn", "Vyshneve", "Chernihiv", "Kherson"};
        int n = (int)(Math.random() * (destinations.length));
        return destinations[n];
    }

    private static int generateNumber(int maxValue){
        Random rand = new Random();
        return rand.nextInt(maxValue) + 1;
    }

    public ArrayList<Train> getTrainStorage(){
        return this.trains;
    }

}
