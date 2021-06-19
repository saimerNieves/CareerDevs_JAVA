package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] arr = new int[8];
        arr[3] = 3;

        List<Integer> list = new ArrayList<>();
        List<Dog> myDogs = new ArrayList<>();

        myDogs.add(new Dog("Brown","Saimer"));
        myDogs.add(new Dog("blue","toby"));
        myDogs.add(new Dog("yellow","sparky"));
        myDogs.add(new Poodle("blue","Marcus"));

        list.add(8);
        list.add(3);
        list.add(42);
        list.add(3000);

        System.out.println(list.get(3));

        for(int i =0; i < list.size(); i++){
//            System.out.println(list.get(i));
        }

//        System.out.println(myDogs.get(0));

        for(Dog dog: myDogs){
            System.out.println(dog);
            if(dog instanceof Poodle){
                System.out.println(((Poodle) dog).dance());
            }

        }

        //integer instead of int
        //classes are uppercase

        //premitive datta types are not objects and dont have mthods
//         int;
//         boolean;
//         char;
//         float;
//         long;
//         double;
//         byte;

    }

}
