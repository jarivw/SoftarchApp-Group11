package com.example.SoftarchApp.Passenger;

import java.util.UUID;

public interface PassengerInterface {

    int insertPassenger(UUID passengerid, PassengerModel passenger);

    default int addPassenger(PassengerModel passenger) {
        UUID passengerid = UUID.randomUUID();
        return insertPassenger(passengerid, passenger);
    }
 //test test
}
