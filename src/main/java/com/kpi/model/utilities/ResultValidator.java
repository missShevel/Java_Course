package com.kpi.model.utilities;

import com.kpi.model.exceptions.EmptyResultException;
import com.kpi.model.entities.Train;

import java.util.ArrayList;

public class ResultValidator {

    public static void checkEmptyResult(ArrayList<Train> result) throws EmptyResultException {
        if (result.isEmpty()) {
            throw new EmptyResultException();
        }
    }
}
