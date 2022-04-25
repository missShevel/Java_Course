package com.kpi.model;

public class Time {
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
        return hours + ":" + minutes;
    }
}
