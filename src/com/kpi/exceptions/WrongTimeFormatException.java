package com.kpi.exceptions;

public class WrongTimeFormatException extends Exception {

    public WrongTimeFormatException() {
        super("Wrong time input format");
    }
}
