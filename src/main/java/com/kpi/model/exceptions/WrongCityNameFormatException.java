package com.kpi.model.exceptions;

public class WrongCityNameFormatException extends Exception {

    public WrongCityNameFormatException() {
        super("City name has wong format");
    }

}
