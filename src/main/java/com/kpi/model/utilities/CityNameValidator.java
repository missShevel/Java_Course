package com.kpi.model.utilities;

import com.kpi.model.exceptions.WrongCityNameFormatException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CityNameValidator {

    private Pattern pattern;
    private Matcher matcher;

    private static final String CITY_NAME_PATTERN =
            "^[a-zA-Z]+$";

    public CityNameValidator() {
        pattern = Pattern.compile(CITY_NAME_PATTERN);
    }

    public void validate(final String city) throws WrongCityNameFormatException {
        matcher = pattern.matcher(city);
        if (!matcher.matches()) {
            throw new WrongCityNameFormatException();
        }
    }

}
