package com.company.vehicle_attriubute;

public class Engine {

    //fields

    String type;
    boolean isOn;
    int fuel;


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
