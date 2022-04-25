package com.kpi.model;

import com.kpi.exceptions.EmptyResultException;

import java.util.ArrayList;

public class ResultValidator {

    public static void checkEmptyResult(ArrayList<Train> result) throws EmptyResultException {
        if (result.isEmpty()) {
            throw new EmptyResultException();
        }
    }
}
