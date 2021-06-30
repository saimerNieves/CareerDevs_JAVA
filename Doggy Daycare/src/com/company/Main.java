package com.company;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
	// write your code here

        DayCare CareerDevsDogCare = new DayCare();

        Dog sparky = new Dog(4,"small",false,"sparky",false,false,"pitbull",2.2);

        Cat mitsy = new Cat(4,"medium",true,"mitsy",true,"straight",false,true,"mewwwwww");

        Dog luis = new Dog(4,"large",true,"luis",false,true,"huskey",4.2);

        CareerDevsDogCare.addAnimal(sparky);
        CareerDevsDogCare.addAnimal(mitsy);
        CareerDevsDogCare.addAnimal(luis);

        CareerDevsDogCare.addAnimal(
                new Animal( 2,  "Small", false, "Mike the Frog", true)

        );

        CareerDevsDogCare.displayAnimals();


        System.out.println("\nCat noise : " + mitsy.speak());

        mitsy.setNoise("MOOOOOOOSS");

        System.out.println("\nCat noise : " + mitsy.speak());

        CareerDevsDogCare.removeAnimal("mitsy");

        System.out.println("\n");
        CareerDevsDogCare.displayAnimals();
    }
}
