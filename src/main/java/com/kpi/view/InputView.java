package com.kpi.view;

import com.kpi.model.utilities.CityNameValidator;
import com.kpi.model.utilities.Time24HoursValidator;
import com.kpi.model.exceptions.IncorrectInputException;
import com.kpi.model.exceptions.WrongCityNameFormatException;
import com.kpi.model.exceptions.WrongTimeFormatException;
import com.kpi.model.entities.Time;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputView {
    private static Scanner sc;
    private MainView view;


    public InputView(MainView view) {
        this.view = view;
    }

    public int inputIntValueWithScanner() throws IncorrectInputException {
        view.printMessage(view.INPUT_MESSAGE);
        sc = new Scanner(System.in);
        try {
            int type = sc.nextInt();
            if (type > 0 && type < 4) {
                return type;
            } else {
                throw new IncorrectInputException();
            }
        }
        catch (InputMismatchException e){
            throw new IncorrectInputException();
        }
    }

    public String inputCity() throws WrongCityNameFormatException {
        sc = new Scanner(System.in);
        view.printMessage(view.ENTER_DESTINATION);
        String city = sc.nextLine();
        city = city.trim();
        new CityNameValidator().validate(city);
        city = city.substring(0, 1).toUpperCase() + city.substring(1).toLowerCase();
        return city;
    }

    public Time inputTime() throws WrongTimeFormatException {
        sc = new Scanner(System.in);
        view.printMessage(view.ENTER_TIME);
        String inputTime = sc.nextLine();
        new Time24HoursValidator().validate(inputTime);
        int hours = Integer.parseInt(inputTime.substring(0, inputTime.indexOf(":")));
        int minutes = Integer.parseInt(inputTime.substring(inputTime.indexOf(":") + 1));
        return new Time(hours, minutes);
    }
    public File inputFileName(){
        System.out.print( "Type filename: ");
        sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        return new File(fileName + ".txt");
    }
}

