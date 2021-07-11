package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //At the factory we are making this dispenser
        //We passed down 3 sizes so that it will know what type of cupholders will be built in
        //Right now is just a DrinkDispenser with built in Cupholders

        DrinkDispenser mcDonalds_Drinks = new DrinkDispenser(5,8,12);

        //Adding syrup indide of the DrinkDispenser

        mcDonalds_Drinks.addSyrup(new Syrup("Dr Pepper",50));
        mcDonalds_Drinks.addSyrup("Coke",20);
        mcDonalds_Drinks.addSyrup(new Syrup("Sprite",40));
        mcDonalds_Drinks.addSyrup("Grape Soda",70);

        mcDonalds_Drinks.serveDrink("medium",2);



    }
}
