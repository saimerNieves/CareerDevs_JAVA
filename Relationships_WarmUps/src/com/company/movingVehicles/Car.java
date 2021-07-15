package com.company.movingVehicles;
import com.company.*;
import com.company.vehicle_attriubute.Engine;
import com.company.vehicle_attriubute.Passenger;
import com.company.vehicle_attriubute.Tire;

import java.util.ArrayList;

public class Car extends Vehicle{

    //Fields
    public ArrayList<Tire> tires = new ArrayList<>();


    //Constructor


    public Car(Engine vehicle_Engine, int vehicle_maxPassenger){

        super( vehicle_Engine,  vehicle_maxPassenger);

        //Parent attributes
        this.type = "car";
        this.isLand = true;
        this.isWater = false;
        this.isAir = false;
        this.isSpace = false;
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

//    public void replaceTire(){}

}
