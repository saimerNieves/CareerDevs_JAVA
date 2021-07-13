package com.company.movingVehicles;

import com.company.*;
import com.company.vehicle_attriubute.*;

import java.util.ArrayList;


public class Boat extends Vehicle {

    //fields

    String type = "Boat";
    boolean isLand = false;
    boolean isWater = true;
    boolean isAir = false;
    boolean isSpace = false;
    Passenger passengers;
    int maxLoad;//max for boat

    //Constructor

    public Boat(Engine boat_Engine){
        super( boat_Engine);
    }



    @Override
    public void addPassenger(Passenger newPassenger){

        if(checkWeight(getPassengers()) < this.maxLoad) {

            this.passengerArrayList.add(newPassenger);
        }
        else {

            System.out.println( "VEHICLE IS FULL");
        }

    }


    public int checkWeight(ArrayList<Passenger> arrayOfPassengers){

        int totalWeight = 0;

        for(int i = 0 ; i < arrayOfPassengers.size(); i++){

            totalWeight += arrayOfPassengers.get(i).weight;
        }
        return totalWeight;

    }





}
