package com.company;

public class Syrup {

    //Fields
    public String name; //name of the syrup
    public double volume; // volume of the syrup


    //Constructors
    public Syrup(String name, int volume){

        this.name = name;
        this.volume = volume;
    }


    //Methods
    public String dispense(int amount){

        this.volume -= amount;

        return name; //We are returning the name of the syrup we got.
    }

    public double getVolume(){

        return volume; //This is going to return the volume of the syrup.
    }




}
