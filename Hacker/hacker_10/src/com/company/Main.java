package com.company;

public class Main {

    //5
    public static String getBinary(int newNumber){

        //Base Case
        if(newNumber < 2){
            return  String.valueOf (newNumber ); // 101
        }
        //Recursive Case
        else{

            int binaryNum = (newNumber % 2); // 1 // 0
            int quotient = (int) Math.floor(newNumber/2); // 2 //  1
            return   getBinary(quotient) + String.valueOf(binaryNum);// 1 // 0
        }
    }

    public static void main(String[] args) {
	// write your code here



        System.out.println( getBinary(45));


    }
}
