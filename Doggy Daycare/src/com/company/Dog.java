package com.company;

public class Dog extends Animal{


    //Properties
    public String breed;
    public double snoutLength;
    public boolean isEmotionalSupportDog;


    //Constructors Inherited from Animal Class
    public Dog(int legs_input, String size_input, boolean isFixed_input, String name_input, boolean isBornInAmerica_input, boolean isEmotionalSupportDog_input, String breed_input, double snoutLength_input){


        super(legs_input,size_input,isFixed_input,name_input,isBornInAmerica_input);

        this.isEmotionalSupportDog = isEmotionalSupportDog_input;
        this.breed = breed_input;
        this.snoutLength = snoutLength_input;

    }


    //Constructor
    public Dog(){

        super();

        this.isEmotionalSupportDog = false;
        this.breed = "";
        this.snoutLength = 0;
    }

    //Method
    @Override
    public String speak(){
        return "Bark Bark";
    }




}
