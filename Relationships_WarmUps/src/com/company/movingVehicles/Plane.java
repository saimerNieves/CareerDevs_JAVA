package com.company.movingVehicles;

import com.company.*;
import com.company.vehicle_attriubute.*;
import java.util.ArrayList;

//Saimer Nieves

public class Plane extends Vehicle {

    //fields
    //

    //TODO make sure to take away these fields because they are already inhertied
    public ArrayList<Tire> tires = new ArrayList<>();
    public boolean isLanding;


    //Constructor
    public Plane(Engine plane_engine, ArrayList<Tire> tires, int vehicle_maxPassenger ){

        this.engine = plane_engine;
        this.maxPassengers = vehicle_maxPassenger;
        this.tires = tires;

        //Default parent setting fields
        this.type = "Plane";
        this.isLand = false;
        this.isWater = false;
        this.isAir = true;
        this.isSpace = false;
    }


    //Methods

    public void toggleLanding(){

        this.isLanding = true;
    }

    public void addTire(Tire newTire){

        if(this.tires.size() < 6){
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



    //TODO this is a bonus make sure you complete it
    public void replaceTire(){

    }

}
