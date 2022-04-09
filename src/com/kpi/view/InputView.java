package com.kpi.view;

import java.util.Scanner;

public class InputView {
    private static Scanner sc;
    private TrainView view;

    public InputView(TrainView view) {
        this.view = view;
        this.sc = new Scanner(System.in);
    }

    public static int inputIntValueWithScanner(TrainView view) {
        view.printMessage(view.INPUT_MESSAGE);
        while (!sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT + "\n" +
                    view.INPUT_MESSAGE);

            sc.next();
        }
        return sc.nextInt();
    }
}

