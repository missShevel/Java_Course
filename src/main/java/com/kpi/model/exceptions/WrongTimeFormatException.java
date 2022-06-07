package com.kpi.model.exceptions;

public class WrongTimeFormatException extends Exception {

    public WrongTimeFormatException() {
        super("Wrong time input format");
    }
}
