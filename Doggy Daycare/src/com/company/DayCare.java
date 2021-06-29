package com.company;

import java.util.ArrayList;

public class DayCare {

    public static void addAnimal(Animal animal_input, ArrayList arrayList_input){
        try{
            arrayList_input.add(animal_input);
        }catch (Exception e){
            System.out.println("Error from your AddAnimal Function");
        }

    }

    public static void displayAnimals(ArrayList<Animal> animalList){
        try{
            for (int i = 0; i < animalList.size(); i++){
                System.out.println(animalList.get(i));
            }
        }
        catch(Exception e){
            System.out.println(" Error from your DisplayAnimals Method");;
        }
    }



}
