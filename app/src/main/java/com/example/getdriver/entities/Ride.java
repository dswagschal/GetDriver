package com.example.getdriver.entities;

import android.location.Location;

import java.sql.Time;

public class Ride
{
    private static long id = 10;
    private  RideState state;

    private Location startingPoint;
    private Location finalPoint;

    private Time startingTime;
    private Time finishingTime;

    private String nameOfCustemer;
    private String numberOfCustemer;
    private String emailOfCustemer;;

    private String driverId;

    //----------------------------------GETTER/SETTER-------------------------------------------------------------
    public static long nextId()
    {
        return ++id;
    }

    public RideState getState() {
        return state;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public Location getStartingPoint() {
        return startingPoint;
    }

    public Location getFinalPoint() {
        return finalPoint;
    }

    public Time getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(Time startingTime) {
        this.startingTime = startingTime;
    }

    public Time getFinishingTime() {
        return finishingTime;
    }

    public void setFinishingTime(Time finishingTime) {
        this.finishingTime = finishingTime;
    }

    public Ride(long id, RideState state, Location startingPoint, Location finalPoint, Time startingTime, Time finishingTime, String nameOfCustemer, String numberOfCustemer, String emailOfCustemer) {
        this.id = id;
        this.state = state;
        this.startingPoint = startingPoint;
        this.finalPoint = finalPoint;
        this.startingTime = startingTime;
        this.finishingTime = finishingTime;
        this.nameOfCustemer = nameOfCustemer;
        this.numberOfCustemer = numberOfCustemer;
        this.emailOfCustemer = emailOfCustemer;
    }
    public Ride()
    {  }

    public String getNameOfCustemer() {
        return nameOfCustemer;
    }

    public String getNumberOfCustemer() {
        return numberOfCustemer;
    }

    public void setState(RideState state) {
        this.state = state;
    }

    public void setStartingPoint(Location startingPoint) {
        this.startingPoint = startingPoint;
    }

    public void setFinalPoint(Location finalPoint) {
        this.finalPoint = finalPoint;
    }



    public void setNameOfCustemer(String nameOfCustemer) {
        this.nameOfCustemer = nameOfCustemer;
    }

    public void setNumberOfCustemer(String numberOfCustemer) {
        this.numberOfCustemer = numberOfCustemer;
    }

    public void setEmailOfCustemer(String emailOfCustemer) {
        this.emailOfCustemer = emailOfCustemer;
    }

    public String getEmailOfCustemer() {
        return emailOfCustemer;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
