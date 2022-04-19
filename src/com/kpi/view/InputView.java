package com.kpi.view;
import com.kpi.controller.IncorrectInputException;
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
        if(type >= 0) {
            return type;
        } else {
            throw new IncorrectInputException();
        }
    }

    public String inputCity() {
        Scanner scan = new Scanner(System.in);
         view.printMessage(view.ENTER_DESTINATION);
        return scan.nextLine();
    }

    public Time inputTime(){
        Scanner scan = new Scanner(System.in);
        view.printMessage(view.ENTER_TIME);
        String time = scan.nextLine();
        int hours = Integer.parseInt(time.substring(0, time.indexOf(":")));
        int minutes = Integer.parseInt(time.substring(time.indexOf(":") + 1));
        return new Time(hours, minutes);
    }
}

