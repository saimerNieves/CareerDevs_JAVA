package com.company;

public class Die {


    //Fields
    public int number_Of_Sides; // number of sides
    public int face_Up_Value; // faceUpValue


    //Constructor

    //Default Constructor
    public Die(){

        this.number_Of_Sides = 6;
    }

    public Die( int number_Of_Sides){

        this.number_Of_Sides = number_Of_Sides;
    }





    //Methods

    public int roll(){

        this.face_Up_Value = 1;
        return this.face_Up_Value;
    }


}
