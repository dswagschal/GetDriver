package com.example.getdriver.backEnd;

import android.support.annotation.NonNull;

import com.example.getdriver.entities.Driver;
import com.example.getdriver.entities.Ride;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class backEndImp implements BackEnd {

    static DatabaseReference DriveRef;
    static List<Driver> DriveList;

    static {

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DriveRef = database.getReference("rides");
        DriveList = new ArrayList<>();
    }
    public List<String> driverName() {
        List<String> tmp=new ArrayList<>();
         for(int i=0;i<DriveList.size(); i++ )
             tmp.add(DriveList.get(i).getFirstName());
return tmp;
    }

    @Override
    public void addDriver(Driver driver,final Action<Long> action) {

        String key = String.valueOf(driver.getId());
        DriveRef.child(key).setValue(driver).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                action.onSuccess(Driver.getId());
                action.onProgress("upload driver data", 100);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                action.onFailure(e);
                action.onProgress("error upload driver data", 100);

            }
        });
    }




    @Override
    public List<Ride> getRides() {
        return null
    }

    @Override
    public List<Ride> getRideBydriver(Driver driver) {
        return null;
    }

    @Override
    public List<Ride> getRidesInCity(String city) {
        return null;
    }

    @Override
    public List<Ride> getRidesByDestiny(double destiny) {
        return null;
    }

    @Override
    public List<Ride> getRidesByDate() {
        return null;
    }

    @Override
    public List<Ride> getRidesByCost() {
        return null;
    }
}
