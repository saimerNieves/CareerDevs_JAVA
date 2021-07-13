package com.company.vehicle_attriubute;

public class Engine {

    //fields

    public String type;
    public boolean isOn;
    public int fuel;


    //Constructor

    public Engine(String engine_type){
        this.type = engine_type;
        this.isOn = false;
        this.fuel = 0;
    }


    //Methods

    public void turnOn(){
        this.isOn = true;
    }

    public void turnOff(){
        this.isOn = false;
    }
}
