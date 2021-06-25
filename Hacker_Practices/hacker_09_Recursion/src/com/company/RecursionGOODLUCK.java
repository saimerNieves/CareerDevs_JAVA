package com.company;

public class RecursionGOODLUCK {

    //summation
    //7 +6 +5 +4 +3 +2 +1

    public static int Summation(int n){
        //Base case //we are done
        if(n <= 0){

            return 0;
        }
        //Recursive Case // we are not at the end so keep going
        else{
            return n + Summation(n-1);
        }

    }

    public static int multiplication(int number){


        //Base Case //STOP WE ARE AT THE END
        if(number <= 0){
            return 1;
        }
        else{

            return  number * multiplication(number - 1);
        }
        // 7 * 6 * 5 * 4 * 3 * 2 * 1


        //Recursive Case // KEEP GOING


    }

    //5^3 == 5 * 5* 5
    public static int exponentiation(int num, int p){

        //Base Case
        if (p <= 0){
            return 1;
        }
        //Recursive Case
        else {

            return num * exponentiation(num, p-1);

        }
    }
}
