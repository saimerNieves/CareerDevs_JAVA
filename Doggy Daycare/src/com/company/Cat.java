package com.company;

public class Cat extends Animal{

    //Properties
    public String pattern;
    public boolean wasStray;
    public boolean isAggressive;



    //Constructors
    public Cat(){
        super();

        this.pattern = "";
        this.wasStray = false;
        this.isAggressive = false;
        this.setNoise("");
    }

    public Cat(int legs_input, String size_input, boolean isFixed_input, String name_input, boolean isBornInAmerica_input, String pattern_input, boolean wasStray_input, boolean isAggressive_input, String noise_input){

        super( legs_input,  size_input,  isFixed_input,  name_input,  isBornInAmerica_input);

        this.pattern = pattern_input;
        this.wasStray = wasStray_input;
        this.isAggressive = isAggressive_input;
        this.setNoise(noise_input);
    }

    @Override
    public String speak(){

        if(this.getNoise().equals("")){
            return "meow meow";
        }
        else{
            return getNoise();
        }

    }








}
