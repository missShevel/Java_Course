package com.kpi.model.exceptions;

public class EmptyResultException extends Exception{
    public EmptyResultException() {
        super("No trains found");
    }
}
