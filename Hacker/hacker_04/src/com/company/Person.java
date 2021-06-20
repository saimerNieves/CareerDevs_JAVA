package com.company;

public class Person {

    private int age;//Instance variable

    //consctructor that takes integerAge
    public Person( int initialAge){

        if(initialAge >= 0){
            this.age = initialAge;
        }
        else {
            this.age = 0 ;
            System.out.println("Age is not Valid, setting age to 0.");
        }


    }

    //Instance methods
    public void yearPasses(){

        this.age ++;
    }

    public void amIOld(){
        if(this.age >= 18){
            System.out.println("Your are old.");
        }
        else  if (this.age >=13){
            System.out.println("You are a teenager.");
        }
        else if(this.age < 13){
            System.out.println("You are young.");
        }

    }



}
