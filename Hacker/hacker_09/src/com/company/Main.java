package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static int factoral(int firstNumber ){

        //5 + 4 + 3 + 2 + 1

        //Base Case => STOP HERE
        if(firstNumber<=0){
            return 0;
        }
        //Recursive Case => Number + number - 1
        else{
            return firstNumber + factoral(firstNumber-1);
        }
    }

    public static void main(String[] args) throws IOException {

        //Base case is the process of stop repeating our algorithm
        //Recursive case = Repeating the algorithm

        //recursion Good luck

        BufferedReader buff = new BufferedReader( new InputStreamReader(System.in));

        int inputNumber = Integer.parseInt( buff.readLine().trim());

        System.out.println(factoral(inputNumber));





    }
}
