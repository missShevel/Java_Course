package com.kpi.model.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.kpi.model.exceptions.WrongTimeFormatException;

public class Time24HoursValidator {

    private Pattern pattern;
    private Matcher matcher;

    private static final String TIME24HOURS_PATTERN =
            "([01]?[0-9]|2[0-3]):[0-5][0-9]";

    public Time24HoursValidator() {
        pattern = Pattern.compile(TIME24HOURS_PATTERN);
    }

    public void validate(final String time) throws WrongTimeFormatException {
        matcher = pattern.matcher(time);
        if (!matcher.matches())
            throw new WrongTimeFormatException();

    }
}
