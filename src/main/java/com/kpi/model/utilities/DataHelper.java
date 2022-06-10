package com.kpi.model.utilities;

import com.kpi.controller.MainController;
import com.kpi.model.entities.Train;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataHelper {
    private String fileName = MainController.FILE_PATH + "data.ser";
    private static final Logger logger = LogManager.getLogger(DataHelper.class);

    public void saveData(List<Train> trains) {
       try {
           ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
           out.writeObject(trains);

       } catch (IOException e) {
           logger.fatal("something wrong, data not saved " + e);
           throw new RuntimeException(e);
       }
    }

    public ArrayList<Train> loadData() {
        ArrayList<Train> trains = new ArrayList<>();
        try {
            ObjectInputStream train = new ObjectInputStream(new FileInputStream(fileName));
            trains =  (ArrayList<Train>) train.readObject();
            }
        catch (FileNotFoundException e) {
            logger.error("saved data wasn't found, new timetable generated");
            }
        catch (IOException e) {
            logger.error("can't read file with data, new timetable generated" + e);
        } catch (ClassNotFoundException e) {
            logger.error("can't deserialize data, new timetable generated " + e);
        }
        return trains;
    }
    public void saveData(String data, String file) {
        try (FileWriter out = new FileWriter(file)) {
            out.write(data);
            out.flush();
            System.out.println("Result was saved to: \"" + file + "\".");
            } catch (IOException e) {
            logger.error("error of data saving" + e);
        }
    }

}
