package com.company;

import com.sun.jdi.Value;

public class Shot {

    //fields
    private String flavorName;
    private double currentAmount_Liquid;
    private double amount_To_Dispense_Per_Shot;


    //Constructors
    public Shot(){
        this.flavorName = "";
        this.currentAmount_Liquid = 0;
        this.amount_To_Dispense_Per_Shot = 0;
    }

    public Shot(String flavorName, double currentAmount_Liquid, double amount_To_Dispense_Per_Shot){

        this.flavorName = flavorName;
        this.currentAmount_Liquid = currentAmount_Liquid;
        this.amount_To_Dispense_Per_Shot = amount_To_Dispense_Per_Shot;
    }



    //SETTERS AND GETTERS

    public void setFlavorName(String flavorName){

        this.flavorName = flavorName;
    }
    public String getFlavorName(){

        return this.flavorName;
    }

    public void setCurrentAmount_Liquid(double currentAmount_Liquid){

        this.currentAmount_Liquid = currentAmount_Liquid;
    }
    public double getCurrentAmount_Liquid(){

        return this.currentAmount_Liquid;
    }

    public void setAmount_To_Dispense_Per_Shot(double amount_To_Dispense_Per_Shot){

        this.amount_To_Dispense_Per_Shot = amount_To_Dispense_Per_Shot;
    }
    public double getAmount_To_Dispense_Per_Shot(){

        return this.amount_To_Dispense_Per_Shot;
    }







    //Methods
    public String dispense(){

        if((this.currentAmount_Liquid - this.amount_To_Dispense_Per_Shot) >= 0){

            this.currentAmount_Liquid -= this.amount_To_Dispense_Per_Shot;
            return this.flavorName;
        }
        else{

            return "null - Not enough Liquid";
        }


    }

    public int getVolume(){
        int number_Of_Shots = (int) Math.round (this.currentAmount_Liquid / this.amount_To_Dispense_Per_Shot);
        return number_Of_Shots;
    }
}
