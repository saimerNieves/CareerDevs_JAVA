package com.company.vehicle_attriubute;

public class Tire {

    //Fields

    int diameter;
    int pressure;


    //Constuctor

    public Tire( int tire_diameter, int tire_pressure){

        this.diameter = tire_diameter;
        this.pressure = tire_pressure;
    }


    //Methods

    public void fill(int fillPressure){

        this.pressure = fillPressure;
    }


}
