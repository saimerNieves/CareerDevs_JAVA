package com.company;

import java.util.Scanner;

public class Main {



    public static String sizedString(String string_input, int size_input){

        String cleanedStr = String.format("%1$" + size_input + "s", string_input);


        return cleanedStr;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++)
        {
            String s1 = scan.next();
            int x = scan.nextInt();

            int y = scan.nextInt();
            //% - minus symbol means left justified
            // 15 width
            //.25 precision of max

            System.out.printf("%-15s%03d%9d",s1,x,y);
        }
        System.out.println("================================");

//        System.out.println(sizedString("java",15));

    }
}
