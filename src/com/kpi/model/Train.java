
package com.kpi.model;

public class Train {

    private String destination;
    private String IdNumber;
    private Time departureTime;
    private int numberOfGeneralSeats;
    private int numberOfReservedSeats;
    private int numberOfCoupeSeats;
    private int numberOfSVSeats;

    public Train(String destination, String idNumber, int departureHours,
                 int departureMinutes, int numberOfGeneralSeats, int numberOfReservedSeats,
                 int numberOfCoupeSeats, int numberOfSVSeats) {
        this.destination = destination;
        this.IdNumber = idNumber;
        this.departureTime = new Time(departureHours, departureMinutes);
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

    public Time getTime(){
        return this.departureTime;
    }

    public void setTime(int hours, int minutes){
        this.departureTime.setHours(hours);
        this.departureTime.setMinutes(minutes);
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
        String printFormat = "| %-38s | %-11s | %-6s | %-18d | %-18d | %-18d | %-18d |";
        return String.format(printFormat, IdNumber, destination, getTime(), numberOfGeneralSeats, numberOfReservedSeats, numberOfCoupeSeats, numberOfSVSeats);
    }
}
