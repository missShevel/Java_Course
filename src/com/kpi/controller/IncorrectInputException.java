package com.kpi.controller;

public class IncorrectInputException extends Exception{

    public IncorrectInputException(){
        super("Your input Is Wrong! Try again :)");
    }

}
