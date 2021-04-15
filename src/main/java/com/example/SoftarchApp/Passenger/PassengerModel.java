package com.example.SoftarchApp.Passenger;

import java.util.UUID;

public class PassengerModel {

    private final UUID passengerid;
    private final String name;

    public PassengerModel(UUID passengerid, String name){
        this.passengerid = passengerid;
        this.name = name;
    }
}
