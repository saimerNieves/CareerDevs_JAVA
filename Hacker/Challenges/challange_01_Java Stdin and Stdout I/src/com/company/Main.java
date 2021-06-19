package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

//        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
//
//        int firstInteger = Integer.parseInt(buffer.readLine().trim());
//        int secondInteger = Integer.parseInt(buffer.readLine().trim());
//        int thirdInteger = Integer.parseInt(buffer.readLine().trim());

        Scanner scan = new Scanner(System.in);
            int firstInteger = scan.nextInt();
            int secondInteger = scan.nextInt();
            int thirdInteger = scan.nextInt();

            System.out.println(firstInteger);
            System.out.println(secondInteger);
            System.out.println(thirdInteger);

        scan.close();
//        buffer.close();

    }
}
