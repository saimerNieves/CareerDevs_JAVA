package com.company;

public class Syrup {

    //Fields
    private String drink_Name;
    private double amount_Of_Liquid;

    //SETTERS AND GETTERS

    public void setDrink_Name( String drink_Name){
        this.drink_Name = drink_Name;
    }

    public String getDrink_Name(){
        return this.drink_Name;
    }

    public void setAmount_Of_Liquid(double amount_Of_Liquid){
        this.amount_Of_Liquid = amount_Of_Liquid;
    }

    public double getVolume(){
        return this.amount_Of_Liquid;
    }



    //CONTRUCTORS
    public Syrup(){

        this.drink_Name = "";
        this.amount_Of_Liquid = 0;
    }
    public Syrup(String drink_Name, double amount_Of_Liquid){

        this.drink_Name = drink_Name;
        this.amount_Of_Liquid = amount_Of_Liquid;
    }



    //METHODS
    public void dispense(double amount_Of_Liquid){
        this.amount_Of_Liquid-=amount_Of_Liquid;
    }





}
