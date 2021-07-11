package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here


        //At the factory we are making this dispenser
        //We passed down 3 sizes so that it will know what type of cupholders will be built in
        //Right now is just a DrinkDispenser with built in Cupholders

        DrinkDispenser mcDonalds_Drinks = new DrinkDispenser(5,8,12);

        mcDonalds_Drinks.medium.reFill(20);

        //Adding syrup indide of the DrinkDispenser

        mcDonalds_Drinks.addSyrup(new Syrup("Dr Pepper",50));
        mcDonalds_Drinks.addSyrup("Coke",20);
        mcDonalds_Drinks.addSyrup(new Syrup("Sprite",40));
        mcDonalds_Drinks.addSyrup("Grape Soda",70);


        System.out.printf("Cups Amount: %d\t   Syrup Volume Left: %f\n", mcDonalds_Drinks.medium.quantity ,  mcDonalds_Drinks.syrups_Array.get(2).getVolume());



        //This is serving the cup down and is also inserting the syrup juice
        //from array list with index 2
        mcDonalds_Drinks.serveDrink("medium",2);


        System.out.printf("Cups Amount: %d\t   Syrup Volume Left: %f\n", mcDonalds_Drinks.medium.quantity ,  mcDonalds_Drinks.syrups_Array.get(2).getVolume());


    }
}
