package com.company;

public class Animal {


    //Properties
    public int legs;
    public String size;
    public boolean isFixed;
    public String name;
    public boolean isBornInAmerica;
    private String noise;

    //Constructors
    public Animal (int legs_input, String size_input, boolean isFixed_input, String name_input, boolean isBornInAmerica_input){

        this.legs = legs_input;
        this.size = size_input;
        this.isFixed = isFixed_input;
        this.name = name_input;
        this.isBornInAmerica = isBornInAmerica_input;

    }

    public Animal(){

        this.legs = 0;
        this.size = "";
        this.isFixed = false;
        this.name = "" ;
        this.isBornInAmerica = false;
        this.noise="";
    }



    //Methods
    public String speak(){
        return "---";
    }

    public void setNoise(String noise_input){
        this.noise = noise_input;
    }

    public String getNoise(){
        return this.noise;
    }

    public String toString(){

        return this.getClass().getSimpleName() + " Name: " + this.name + ", Size: " +  this.size + ", isFixed: " + this.isFixed + ", Legs: " + this.legs + ", Born in America: " + this.isBornInAmerica  ;
    }





}
