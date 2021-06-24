package com.company;


//The import statement can be used to import an entire package or sometimes
// import certain classes and interfaces inside the package
import java.util.*;



public class Main {

    public static void main(String[] args) {


//        // Create a Scanner object Instance to read input .
//        Scanner scan = new Scanner(System.in);
//
//        // Read a full line of input //Stores input by user into variable
//
//        String inputString = scan.nextLine();       //scan String
//        Boolean inputBoolean = scan.nextBoolean();  //scan Boolean
//        double inputDouble = scan.nextDouble();     //scan Double
//        int inputInt = scan.nextInt();              //scan Integer
//        float inputFloat  = scan.nextFloat();       //scan Float
//
//        //Printing out information , printing out the word "Luis"
//        System.out.println("Luis");
//
//        //declared and initialized a random number variable with the value of 4
//        int a_Random_Num = 4;
//
//        //Printing out information / outputting value within "a_Random_Num" => 4
//        System.out.println(a_Random_Num);
//
//
//
//        // Close the scanner object, because we've finished reading
//        // all of the input from stdin needed for this challenge.
//        scan.close();
//
//        // Print a string literal saying "Hello, World." to stdout.
//        System.out.println("Hello, World.");
//
//        // TODO: Write a line of code here that prints the contents of inputString to stdout.
//
//        System.out.println(inputString);

        Scanner scan = new Scanner(System.in);

        // Read a full line of input from stdin and save it to our variable, inputString.
        String inputString = scan.nextLine();

        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scan.close();

        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World.");

        // TODO: Write a line of code here that prints the contents of inputString to stdout.
        System.out.println(inputString);


    }
}


