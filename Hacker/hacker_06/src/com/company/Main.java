package com.company;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<String> wordsList = new ArrayList<>(); // new Instance of Array list


    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner scan = new Scanner(System.in);

        int running_num = Integer.parseInt( scan.next());

        for (int i = 0 ; i < running_num; i++) {
            String temp_string = scan.next();
            wordsList.add(temp_string);
        }

        for (int i = 0; i < wordsList.size(); i++) {

            String one_word = wordsList.get(i);

            ArrayList<String> oddLetters_List = new ArrayList<>();
            ArrayList<String> evenLetters_List = new ArrayList<>();

            for (int j = 0; j < one_word.length(); j++){

                if( j % 2 == 1){

                    String oddLetter_str = String.valueOf(one_word.charAt(j));
                    oddLetters_List.add(oddLetter_str);
                }
                else if( j % 2 == 0){

                    String evenLetter_str = String.valueOf( one_word.charAt(j) );
                    evenLetters_List.add(evenLetter_str);
                }

            }

            for(String letter: evenLetters_List  ){

                System.out.print(letter);
            }

            System.out.print(" ");

            for (String letter: oddLetters_List){

                System.out.print(letter);
            }
            System.out.println();

        }

        scan.close();


    }
}
