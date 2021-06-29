package com.company;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
	// write your code here

        ArrayList<Animal> animalsList = new ArrayList<>();

        Dog sparky = new Dog(4,"small",false,"sparky",false,false,"pitbull",2.2);

        Cat mitsy = new Cat(4,"medium",true,"mitsy",true,"straight",false,true,"mewwwwww");

        Dog luis = new Dog(4,"large",true,"luis",false,true,"huskey",4.2);

        DayCare.addAnimal(sparky,animalsList);
        DayCare.addAnimal(mitsy,animalsList);
        DayCare.addAnimal(luis,animalsList);

        DayCare.displayAnimals(animalsList);


        System.out.println("Cat noise : " + mitsy.speak());

        mitsy.setNoise("MOOOOOOOSS");

        System.out.println("Cat noise : " + mitsy.speak());

        DayCare.removeAnimal("mitsy",animalsList);


        DayCare.displayAnimals(animalsList);
    }
}
