package com.company; //Package connections

//Importing Some Libraries
import java.io.*;
import java.sql.SQLOutput;


public class Main {
    public static void main(String[] args) throws IOException {

//        Given an integer, , perform the following conditional actions:
//        If  is odd, print Weird
//        If  is even and in the inclusive range of  to , print Not Weird
//        If  is even and in the inclusive range of  to , print Weird
//        If  is even and greater than , print Not Weird
//        Complete the stub code provided in your editor to print whether or not  is weird.

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Type a Number: ");
        int N = Integer.parseInt( buff.readLine().trim());

        if(N % 2 ==1){

            System.out.println("Weird");

        }
        else{

            if ((N > 20)){

                System.out.println("Not Weird");
            }
            else if( (N >= 6)) {

                System.out.println("Weird");
            }
            else if((N >= 2)){

                System.out.println("Not Weird");
            }
        }
    }
}
