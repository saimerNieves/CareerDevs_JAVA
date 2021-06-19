package com.company;


public class humans {

    public String nationality;
    public String language;
    public String message;

    //default constructor
    public humans(){
        this.nationality="";
        this.language="";
        this.message="";
    }

    //initialize constructor
    public humans(String nationality_input, String languange_input, String message_input) {

        this.nationality = nationality_input;
        this.language = languange_input;
        this.message = message_input;

    }


    //methods
    public void speak(){
        System.out.println("I am from " + this.nationality + ", I speak " + this.language + " and this is my message: "+ this.message);
    }


}
