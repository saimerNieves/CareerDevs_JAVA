package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
	// write your code here

        BufferedReader buff = new BufferedReader( new InputStreamReader(System.in));
        int arraySize = Integer.parseInt( buff.readLine().trim());

        String[] numArray ;


        String all_numbers_input = buff.readLine().trim();
        numArray = all_numbers_input.split(" ");


        for (int i = arraySize-1; i >= 0; i--){
            System.out.print(numArray[i] + " ");
        }




        buff.close();
    }
}
