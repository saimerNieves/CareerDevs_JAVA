package com.company;

import java.util.ArrayList;

public class DayCare {

    ArrayList<Animal> animalList = new ArrayList<>();

    public  void addAnimal(Animal animal_input){
        try{
            animalList.add(animal_input);
        }catch (Exception e){
            System.out.println("Error from your AddAnimal Function");
        }

    }

    public void displayAnimals(){
        try{
            for (int i = 0; i < animalList.size(); i++){

                if(animalList.get(i).getClass().getSimpleName().equals("Dog")){

                    Dog dog = (Dog) animalList.get(i);
                    System.out.println( "Im a dog and my Name is " + dog.name +". My size is " + dog.size + ". Nice to meet you !  " + dog.getNoise());
                }
                else if(animalList.get(i).getClass().getSimpleName().equals("Cat")){

                    Cat cat = (Cat) animalList.get(i);
                    System.out.println( "Im a Cat and I am very Sneaky.  Name is " + cat.name +". My size is " + cat.size + ". I Sleep all day! " + cat.getNoise() + " my pattern is " + cat.pattern);
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

    public  void removeAnimal(String name_input){

        for (int i = 0 ; i < animalList.size(); i++){

//            animalList_input.removeIf(innerElement -> innerElement.name.equals(name_input));

//            for(Animal animal: animalList_input){
//                if(animal.name.equals(name_input)){
//                    animalList_input.remove(animal);
//                    break;
//                }
//            }
            if(  animalList.get(i).name.equals(name_input)){

                animalList.remove(i--);
                break;
            }
        }
    }

}
