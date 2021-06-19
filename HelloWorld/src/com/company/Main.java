package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        doctor saimer = new doctor();
        saimer.nationality = "Dominican Republic";
        saimer.language = "spanish";
        saimer.message = "hola como estas ? ";

        saimer.speak();


        humans luis = new humans("United States","English","Hello How are you?");
        luis.speak();
    }
}
