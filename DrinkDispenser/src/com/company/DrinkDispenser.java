package com.company;

import java.util.ArrayList;
import java.util.Locale;

public class DrinkDispenser {

    public static ArrayList<Syrup> syrupsCollection = new ArrayList<>();
    public static ArrayList<Shot> shotsCollection = new ArrayList<>();
    public static CupHolder smallCups = new CupHolder(8,50);
    public static CupHolder mediumCups = new CupHolder(16,50);
    public static CupHolder largeCups = new CupHolder(32,50);
    public static CupHolder[]  cupsCollections = new CupHolder[]{smallCups,mediumCups,largeCups};


    //Methods

    //TODO ALL BELOW CODE I STILL NEED TO DO NOT TESTED
    public static void ServeDrink(String size, String syrupType){
        //return medium Coke
        double volumePerCup =0;

        for (int i = 0 ; i < cupsCollections.length; i++){



            if(size.toLowerCase().equals("small")){
                volumePerCup = smallCups.dispenseCup();
                break;
            }
            else if(size.toLowerCase().equals("medium")){
                volumePerCup =  mediumCups.dispenseCup();
                break;
            }
            else if(size.toLowerCase().equals("large")){
                volumePerCup = largeCups.dispenseCup();
                break;
            }
        }


        for (int i = 0; i < syrupsCollection.size(); i++){

            if (syrupsCollection.get(i).getDrink_Name().equals(syrupType)){

                syrupsCollection.get(i).dispense(volumePerCup);
            }
        }
    }

    public static void ServeDrink(String size,int syrupIndex, int shotIndex, int shotCount){

        //will get a cup of size requested add shotcount of shotIndex shot and dispense
        // //the syrup requested will display "{Size} {Shot} {Drink}" ex "Large Cherry Sprite"


    }

    public static void lowSyrups(double volume){

        //will scan the syrups and return the indexes of any syrups that have less then vol liquid remaining
    }

    public static void lowShots(int num){

        //will scan the shots and return the indexes of any shots that have less then num shots remaining

    }

    public static void addSyrups(Syrup syrup){

        // will add the syrup to the collection
    }

    public static void addShot(Shot shot){

        //will add the shot to the collection.
    }


}
