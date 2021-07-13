package com.company;
import com.company.vehicle_attriubute.*;

import java.util.ArrayList;

public class Vehicle {

    //Fields

    public Engine engine;
    public String type;
    public boolean isLand;
    public boolean isWater;
    public boolean isAir;
    public boolean isSpace;
    public int maxPassengers;
    public ArrayList<Passenger> passengerArrayList = new ArrayList<>();


    //Constructors

    public Vehicle(){


    }

    public Vehicle(Engine vehicle_Engine){

        this.engine = vehicle_Engine;

    }



    public Vehicle(Engine vehicle_Engine, String vehicle_type, int vehicle_maxPassenger){

        this.engine = vehicle_Engine;
        this.type = vehicle_type;
        this.maxPassengers = vehicle_maxPassenger;


    }

    //Methods

    public void turnOn(){

        this.engine.turnOn();
    }

    public void turnOff(){

        this.engine.turnOff();

    }

    public void addPassenger(Passenger newPassenger){

        if(this.passengerArrayList.size() < this.maxPassengers){

            this.passengerArrayList.add(newPassenger);
        }
        else {

            System.out.println( "VEHICLE IS FULL");
        }




    }

    public void removePassenger(Passenger passenger){

        if(this.passengerArrayList.size() > 0){

            this.passengerArrayList.remove(passenger);
        }
        else {

            System.out.println( "VEHICLE IS EMPTY");
        }
    }


    public ArrayList<Passenger> getPassengers(){
        return passengerArrayList;
    }

}
