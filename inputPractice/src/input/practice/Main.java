package input.practice;
//import Library

import java.util.*;



public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);//input statement => created the scanner object to read input

        System.out.print("Please type in your name:    "); // label
        int inputAnswer = input.nextInt(); //take input from the next line and store it here

        System.out.println("Your name is: " + inputAnswer);//Print out your answer
        input.close();// we are closing the scanner object
    }
}
