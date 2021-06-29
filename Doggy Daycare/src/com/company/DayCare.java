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

                if(animalList.get(i).getClass().getSimpleName().equals("Dog")){
                    System.out.println(animalList.get(i).toStringDog());
                }
                else if(animalList.get(i).getClass().getSimpleName().equals("Cat")){
                    System.out.println(animalList.get(i).toStringCat());
                }
                else{
                    System.out.println(animalList.get(i)); // if is not cats or dogs print as any regular animal using default toString
                }


            }
        }
        catch(Exception e){
            System.out.println(" Error from your DisplayAnimals Method");;
        }
    }

    public static void removeAnimal(String name_input, ArrayList<Animal> animalList_input){

        for (int i = 0 ; i < animalList_input.size(); i++){

//            animalList_input.removeIf(innerElement -> innerElement.name.equals(name_input));

//            for(Animal animal: animalList_input){
//                if(animal.name.equals(name_input)){
//                    animalList_input.remove(animal);
//                    break;
//                }
//            }
            if(  animalList_input.get(i).name.equals(name_input)){

                animalList_input.remove(i--);
                break;
            }
        }
    }

}
