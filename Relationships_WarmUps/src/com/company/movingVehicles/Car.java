package com.company.movingVehicles;
import com.company.*;
import com.company.vehicle_attriubute.Engine;
import com.company.vehicle_attriubute.Passenger;
import com.company.vehicle_attriubute.Tire;

import java.util.ArrayList;

public class Car extends Vehicle{

    //Fields

    String type = "Car";
    boolean isLand = true;
    boolean isWater = false;
    boolean isAir = false;
    boolean isSpace = false;
    Passenger passengers;
    public ArrayList<Tire> tires;


    //Constructor

    public Car(Engine vehicle_Engine, ArrayList<Tire> tires , int vehicle_maxPassenger){

        this.engine = vehicle_Engine;
        this.maxPassengers = vehicle_maxPassenger;
        this.tires = tires;


    }



    //Methods

    public void addTire(Tire newTire){
        if(this.tires.size() < 4){

            tires.add(newTire);

        }
        else{
            System.out.println("too many tires");
        }
    }

    public void removeTire( Tire oldtire){

        if(this.tires.size() > 0){

            tires.remove(oldtire);

        }
        else{
            System.out.println("No more tires");
        }
    }

    public void replaceTire(){}

}
