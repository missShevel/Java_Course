package com.kpi.model;

public class Train {

    private String destination;
    private String IdNumber;
    private int departureHours;
    private int departureMinutes;
    private int numberOfGeneralSeats;
    private int numberOfReservedSeats;
    private int numberOfCoupeSeats;
    private int numberOfSVSeats;

    public Train(String destination, String idNumber, int departureHours,
                 int departureMinutes, int numberOfGeneralSeats, int numberOfReservedSeats,
                 int numberOfCoupeSeats, int numberOfSVSeats) {
        this.destination = destination;
        this.IdNumber = idNumber;
        this.departureHours = departureHours;
        this.departureMinutes = departureMinutes;
        this.numberOfGeneralSeats = numberOfGeneralSeats;
        this.numberOfReservedSeats = numberOfReservedSeats;
        this.numberOfCoupeSeats = numberOfCoupeSeats;
        this.numberOfSVSeats = numberOfSVSeats;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getIdNumber() {
        return IdNumber;
    }

    public void setIdNumber(String idNumber) {
        IdNumber = idNumber;
    }

    public String getTime(){
        return this.departureHours + ":" + this.departureMinutes;
    }

    public void setTime(int hours, int minutes){
        this.departureHours = hours;
        this.departureMinutes = minutes;
    }

    public int getNumberOfGeneralSeats() {
        return numberOfGeneralSeats;
    }

    public void setNumberOfGeneralSeats(int numberOfGeneralSeats) {
        this.numberOfGeneralSeats = numberOfGeneralSeats;
    }

    public int getNumberOfReservedSeats() {
        return numberOfReservedSeats;
    }

    public void setNumberOfReservedSeats(int numberOfReservedSeats) {
        this.numberOfReservedSeats = numberOfReservedSeats;
    }

    public int getNumberOfCoupeSeats() {
        return numberOfCoupeSeats;
    }

    public void setNumberOfCoupeSeats(int numberOfCoupeSeats) {
        this.numberOfCoupeSeats = numberOfCoupeSeats;
    }

    public int getNumberOfSVSeats() {
        return numberOfSVSeats;
    }

    public void setNumberOfSVSeats(int numberOfSVSeats) {
        this.numberOfSVSeats = numberOfSVSeats;
    }


    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", IdNumber='" + IdNumber + '\'' +
                ", departureHours=" + departureHours +
                ", departureMinutes=" + departureMinutes +
                ", numberOfGeneralSeats=" + numberOfGeneralSeats +
                ", numberOfReservedSeats=" + numberOfReservedSeats +
                ", numberOfCoupeSeats=" + numberOfCoupeSeats +
                ", numberOfSVSeats=" + numberOfSVSeats +
                '}';
    }
}
