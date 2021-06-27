package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        int inputBuffNum = Integer.parseInt( buff.readLine().trim());

        String binaryNumber =  getBinary(inputBuffNum);

        String[] binarySplit_array = binaryNumber.split("");

        int counter = 0;
        int highestNum = 0;
        for (int i = 0; i < binarySplit_array.length; i++)
        {
            if(binarySplit_array[i].equals("1")){
                counter++;
                if(counter > highestNum){
                    highestNum = counter;
                }

            }
            else if( binarySplit_array[i].equals("0") && (counter > 0)){
                counter --;
            }

        }

        System.out.println("Counter: " + counter);
        System.out.println("highest Number: " + highestNum);

        buff.close();

    }
}


/*
* import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println(consecutiveOnes(n));
    }

    public static int consecutiveOnes(int n) {
        int count = 0;
        int max   = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
            n = n >> 1;
        }
        return max;
    }
}
*/