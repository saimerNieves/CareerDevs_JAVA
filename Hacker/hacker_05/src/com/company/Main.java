package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        //initiated an instance of buffer reader
        BufferedReader buff =  new BufferedReader(new InputStreamReader(System.in));

        //Input first number to multiply
        int numberToMultiply = Integer.parseInt(buff.readLine().trim());

        //initiate a for loop

        for(int i = 1; i <= 10; i++){

            int product = numberToMultiply * i;
            System.out.println(numberToMultiply + " x " + i  + " = " + product);

        }


        buff.close();
    }
}
