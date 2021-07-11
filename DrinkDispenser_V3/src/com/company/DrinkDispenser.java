package com.company;

import java.util.ArrayList;

public class DrinkDispenser {

    public ArrayList<Syrup> syrups; // Collection of multiple instances of Syrup Class.

    //All new Cupholders
    public Cupholder small;
    public Cupholder medium;
    public Cupholder large;


    //Constructors => If the constructor is called for the same instance again it will restart the arrary list thats why is initialized in the constructor
    public DrinkDispenser(int small_vol_int, int medium_vol_int, int large_vol_int){
        this.syrups = new ArrayList<>();

        this.small = new Cupholder(small_vol_int);   // Calls the CupHolder Constructor and provides the small int stating volume size in ounces
        this.medium = new Cupholder(medium_vol_int); // Calls the CupHolder Constructor and provides the medium int stating volume size in ounces
        this.large = new Cupholder(large_vol_int);   // Calls the CupHolder Constructor and provides the large int stating volume size in ounces
    }

    public void serveDrink(String size_str,int syrup_index){

        int volume = 0;
        switch(size_str.toLowerCase()){
            case "small":
                volume = small.dispenseCup();
                break;

            case "medium":
                volume = medium.dispenseCup();
                break;

            case "large":
                volume = large.dispenseCup();
                break;

            default:
                System.out.println("ERROR Invalid size");
                return;
        }
         syrups.get(syrup_index).dispense(volume); //After the cup is dispensed in your hand the syrup ArrayList will get called with an index and it will dispense the volume value return from the cup
    }

    //Add syrup to arrayList after is all reade created
    public void addSyrup(Syrup newSyrup){
        syrups.add(newSyrup);
    }

    //Adding a new syrup just by name and volume
    public void addSyrup(String name, int volume){
        syrups.add(new Syrup(name, volume)); // This is building using a constructor that takes the name and volume of drink
    }






}
