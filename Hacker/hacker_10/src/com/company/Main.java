package com.company;

public class Main {

    //5
    public static String getBinary(int newNumber){

        //Base Case
        if((newNumber/2) < 2){
            System.out.println("Ran here first");
            System.out.println(String.valueOf (newNumber % 2));
            return  String.valueOf (newNumber % 2); // 101


        }

        //Recursive Case
        else{
            System.out.println("Ran here second");
            int binaryNum = (newNumber % 2); // 1 // 0
            int quotient = (int) Math.floor(newNumber/2); // 2 //  1
            System.out.println(binaryNum);
            return String.valueOf(binaryNum) + getBinary(quotient);// 1 // 0



        }


    }

    public static void main(String[] args) {
	// write your code here

        String Saimer = "";

      getBinary(21);




    }
}
