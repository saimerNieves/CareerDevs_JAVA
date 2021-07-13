package com.company.movingVehicles;

import com.company.*;
import com.company.vehicle_attriubute.*;

import java.util.ArrayList;


public class Boat extends Vehicle {

    //fields

    public String type = "Boat";
    public boolean isLand = false;
    public boolean isWater = true;
    public boolean isAir = false;
    public boolean isSpace = false;
    public Passenger passengers;
    public int maxLoad;//max for boat

    //Constructor

    public Boat(Engine boat_Engine, int maxLoad){
        this.engine = boat_Engine;
        this.maxLoad = maxLoad;
    }



    @Override
    public void addPassenger(Passenger newPassenger){

        if((checkWeight(getPassengers()) + newPassenger.weight) < this.maxLoad) {


            this.passengerArrayList.add(newPassenger);
        }
        else {

            System.out.println( "Boat IS FULL");
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
