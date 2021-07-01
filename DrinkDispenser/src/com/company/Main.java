package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        CupHolder smallCups = new CupHolder(18,27);
//
//
//        smallCups.dispenseCup();
//        smallCups.dispenseCup();
//        smallCups.dispenseCup();
//        smallCups.dispenseCup();
//
//
//        System.out.println(smallCups.getQuantity());
//
//        smallCups.refill(7);
//
//        System.out.println(smallCups.getQuantity());


        Shot dr_Pepper = new Shot("Dr Pepper",10,2);

        System.out.println("Amount to Dispense: " + dr_Pepper.getAmount_To_Dispense_Per_Shot());
        System.out.println("FlavorName: " + dr_Pepper.getFlavorName());
        System.out.println("Current Amount: " + dr_Pepper.getCurrentAmount_Liquid());
        System.out.println("How many Cups can we fill: " + dr_Pepper.getVolume());

        System.out.println(" \n\n " + dr_Pepper.dispense());
        System.out.println(" \n\n " + dr_Pepper.dispense());
        System.out.println(" \n\n " + dr_Pepper.dispense());
        System.out.println(" \n\n " + dr_Pepper.dispense());
        System.out.println(" \n\n " + dr_Pepper.dispense());



        System.out.println("Amount to Dispense: " + dr_Pepper.getAmount_To_Dispense_Per_Shot());
        System.out.println("FlavorName: " + dr_Pepper.getFlavorName());
        System.out.println("Current Amount: " + dr_Pepper.getCurrentAmount_Liquid());
        System.out.println("How many Cups can we fill: " + dr_Pepper.getVolume());
    }
}
