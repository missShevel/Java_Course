package com.kpi.model.utilities;

import com.kpi.model.entities.Train;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataHelper {
    File file = new File("src/main/java/com/kpi/data.ser");
    public void saveData(List<Train> trains) {
       try {
           ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
           out.writeObject(trains);

       } catch (IOException e) {
           System.out.println("something wrong, data not saved");
           throw new RuntimeException(e);
       }
    }

    public ArrayList<Train> loadData() {
        ArrayList<Train> trains = new ArrayList<>();
        try {
            ObjectInputStream train = new ObjectInputStream(new FileInputStream(file));
            trains =  (ArrayList<Train>) train.readObject();
            } catch (FileNotFoundException e) {
            System.out.println("saved data wasn't found, new Depo generated");
//            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("can't read file with data, new Depo generated");
//            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("can't deserialize data, new Depo generated");
//            e.printStackTrace();
        }
        return trains;
    }

}
