package com.kpi.model.entities;

import java.io.Serializable;

public class Time implements Serializable {
    int hours;
    int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public static boolean isGreater(Time earlier, Time later) {
        if (earlier.getHours() > later.getHours()) {
            return false;
        } else if (earlier.getHours() == later.getHours()) {
            return earlier.getMinutes() < later.getMinutes();
        }
        return true;
    }

    @Override
    public String toString() {
        String hour = Integer.toString(hours);
        String minute = Integer.toString(minutes);
        if (hours < 10) {
            hour = "0"+hours;
        }
        if(minutes < 10) {
            minute = "0" + minutes;
        }
        return hour + ":" + minute;
    }
}
