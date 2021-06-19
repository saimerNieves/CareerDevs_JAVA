package com.company;

import java.util.Scanner;

public class Main {

    //Global private scanner Variable
    private static final Scanner scanner  = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        int firstInteger = scanner.nextInt();
        scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");
        if(firstInteger % 2 == 1){
            System.out.println("Weird");
        }
        else{
            if(firstInteger > 20){
                System.out.println("Not Weird");
            }
            else if(firstInteger >=6){
                System.out.println("Weird");
            }
            else if(firstInteger >=2){
                System.out.println("Not Weird");
            }
        }


        scanner.close();
    }
}
