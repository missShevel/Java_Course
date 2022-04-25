package com.kpi.exceptions;

public class WrongCityNameFormatException extends Exception {

    public WrongCityNameFormatException() {
        super("City name has wong format");
    }

}
