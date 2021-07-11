package com.company;

import java.util.ArrayList;

public class DrinkDispenser {

    public ArrayList<Syrup> syrups; // Collection of multiple instances of Syrup Class.

    //All new Cupholders
    public Cupholder small;
    public Cupholder medium;
    public Cupholder large;


    //Contructors => If the constructor is called for the same instance again it will restart the arrary list thats why is initialized in the constructor
    public DrinkDispenser(){
        //syrups = new ArrayList<>();
    }




}
