package com.company;

public class doctor extends humans{

    @Override//override
    public void speak(){

        System.out.println("I am a " + " doctor " + " and I am from " + this.nationality + ", I speak " + this.language + " and this is my message: "+ this.message);

    }


}
