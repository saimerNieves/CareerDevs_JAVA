package input.practice;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int numberVar;
        double doubleVar ;
        String stringVar ;

        /* Read and save an integer, double, and String to your variables.*/



        System.out.print("Enter an INT: ");
        numberVar = scan.nextInt();

        System.out.print("Enter a Double: ");
        doubleVar = scan.nextDouble();
        scan.nextLine(); // reads the new line string of the double

        System.out.println("Enter a String: ");
        stringVar = scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        System.out.println(numberVar + i);
        /* Print the sum of the double variables on a new line. */
        System.out.println(doubleVar + d);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + stringVar);

        scan.close();
    }
}