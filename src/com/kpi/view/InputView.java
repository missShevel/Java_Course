package com.kpi.view;

import com.kpi.controller.CityNameValidator;
import com.kpi.controller.Time24HoursValidator;
import com.kpi.exceptions.IncorrectInputException;
import com.kpi.exceptions.WrongCityNameFormatException;
import com.kpi.exceptions.WrongTimeFormatException;
import com.kpi.model.Time;

import java.util.Scanner;

public class InputView {
    private TrainView view;

    public InputView(TrainView view) {
        this.view = view;
    }

    public int inputIntValueWithScanner() throws IncorrectInputException {
        view.printMessage(view.INPUT_MESSAGE);
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        if (type > 0 && type < 4) {
            return type;
        } else {
            throw new IncorrectInputException();
        }
    }

    public String inputCity() throws WrongCityNameFormatException {
        Scanner scan = new Scanner(System.in);
        view.printMessage(view.ENTER_DESTINATION);
        String city = scan.nextLine();
        city = city.trim();
        new CityNameValidator().validate(city);
        city = city.substring(0, 1).toUpperCase() + city.substring(1).toLowerCase();
        return city;
    }

    public Time inputTime() throws WrongTimeFormatException {
        Scanner scan = new Scanner(System.in);
        view.printMessage(view.ENTER_TIME);
        String inputTime = scan.nextLine();
        new Time24HoursValidator().validate(inputTime);
        int hours = Integer.parseInt(inputTime.substring(0, inputTime.indexOf(":")));
        int minutes = Integer.parseInt(inputTime.substring(inputTime.indexOf(":") + 1));
        return new Time(hours, minutes);
    }
}

