package com.company.movingVehicles;
import com.company.*;
import com.company.vehicle_attriubute.Engine;
import com.company.vehicle_attriubute.Passenger;
import com.company.vehicle_attriubute.Tire;

import java.util.ArrayList;

public class Car extends Vehicle{

    //Fields

    //TODO Move to construcors
    public boolean isLand = true;
    public boolean isWater = false;
    public boolean isAir = false;
    public boolean isSpace = false;
    public Passenger passengers;
    public ArrayList<Tire> tires = new ArrayList<>();


    //Constructor

    //TODO use parent constructor Super()
    public Car(Engine vehicle_Engine, int vehicle_maxPassenger){

        this.type = "car";
        this.engine = vehicle_Engine;
        this.maxPassengers = vehicle_maxPassenger;

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
