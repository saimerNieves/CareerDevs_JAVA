package com.company;

public class Cupholder {

    //fields
    public int volume; //Volume per cup
    public int quantity = 0; //how many of that volume is the cupholder holding


    //Constructors
    public Cupholder(int volume){

        this.volume = volume;
    }


    //Methods
    public int dispenseCup(){

        quantity -= 1; //Quanitity will decrease by one
        return volume; //Return the volume of the cup
    }

    public void reFill(int amount){//Method to refill the CupHolder

        quantity += amount; // quantity will increase by this amount inputed
    }
}

