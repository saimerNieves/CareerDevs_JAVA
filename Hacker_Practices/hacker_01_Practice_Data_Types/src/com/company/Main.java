package com.company;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Main {



    public static void main(String[] args) {

        DecimalFormat roundedOnePlace = new DecimalFormat(".#");

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";


        /* Declare second integer, double, and String variables. */
        int secondInteger;
        double secondDouble;
        String secondString;

        /* Read and save an integer, double, and String to your variables.*/
        //Creating a section for input

        //OPENING
        Scanner input = new Scanner(System.in); // input statement Scanner

        //Input Statements into variables
        secondInteger = input.nextInt();//when you type a number put it into this variable
        secondDouble = input.nextDouble();//When you type a Double put it into this variable
        input.next();
        secondString = input.nextLine();

        //Adding values
        int sumInteger = secondInteger + i; // adding secondInteger and I variable
        String sumDouble = roundedOnePlace.format(secondDouble + d);
        String sumString = s + secondString;

        //Outputting
        System.out.println(sumInteger);
        System.out.println(sumDouble);
        System.out.println(sumString);


        //CLOSING
        input.close();




        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        /* Print the sum of both integer variables on a new line. */
        /* Print the sum of the double variables on a new line. */
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */



    }
}