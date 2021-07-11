package com.company;

import java.util.ArrayList;

public class DrinkDispenser {

    public ArrayList<Syrup> syrups; // Collection of multiple instances of Syrup Class.

    //All new Cupholders
    public Cupholder small;
    public Cupholder medium;
    public Cupholder large;


    //Contructors => If the constructor is called for the same instance again it will restart the arrary list thats why is initialized in the constructor
    public DrinkDispenser(int small_int, int medium_int, int large_int){
        //syrups = new ArrayList<>();

        this.small = new Cupholder(small_int);   // Calls the CupHolder Constructor and provides the small int stating volume size in ounces
        this.medium = new Cupholder(medium_int); // Calls the CupHolder Constructor and provides the medium int stating volume size in ounces
        this.large = new Cupholder(large_int);   // Calls the CupHolder Constructor and provides the large int stating volume size in ounces
    }




}
