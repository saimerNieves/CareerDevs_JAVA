package com.company;

import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        int first_Int = scan.nextInt();
        double second_dbl = scan.nextDouble();
        scan.nextLine();

        String third_string = scan.nextLine();

        System.out.println("String: " + third_string);
        System.out.println("Double: " + second_dbl);
        System.out.println("Int: " + first_Int);

        scan.close();
    }
}
