package com.example.getdriver.backEnd;

import android.app.Notification;

import com.example.getdriver.entities.Driver;
import com.example.getdriver.entities.Ride;

import java.util.List;

public interface BackEnd {
    public interface Action<T>{

        void onSuccess(T obj);

        void onFailure(Exception exception);

        void onProgress(String status, double percent);

    }

    List<String> driverName();
    void addDriver(Driver driver, backEndImp.Action<Long> action);
    List<Ride> getRides();
    List<Ride> getRideBydriver(Driver driver);
    List<Ride> getRidesInCity(String city);
    List<Ride> getRidesByDestiny(double destiny);
    List<Ride> getRidesByDate();
    List<Ride> getRidesByCost();
}
