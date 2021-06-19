package com.company;

//This is our first class (parent class)
class Dog{
    //legs and fur are properties of Dog
    private int legs = 4;
    public String fur;

    //This is called a constructor, you can create a dog with this constructor. needs the fur passed
    //as an argument
    public Dog(String fur){
        this.fur = fur;
    }

    public String toString(){
        return "This poodle has " + this.legs;
    }

        //public Dog(){} if you don't have a constructor like above then this is automatically created

    public void speak(){
        System.out.println("woof");
    }

    public int getLegs(){
        return this.legs;
    }
}

//Poodle inherits the properties/methods of Dog (child class of Dog)
class Poodle extends Dog{

    public Poodle(String hair){
        //This uses the Contructor from Dog and passing the hair to the Dog constructor on line 11
        super(hair);
    }
    //overriding the speak in Dog class
    public void speak(){
        System.out.println("a-woof");
    }
    //overloading the speak in Poodle class
    public void speak(String bark){
        System.out.println(bark);
    }

    public String toString(){
        return "This poodle has " + getLegs() + " legs with " + this.fur + " fur";
    }
}

class Calc{
//    public static int sumTotal(int n){
//        //sum all numbers from 1 up to n
//        int total = 0;
//
//        for(int i=1; i <=n ; i++){
//            total+=i;
//        }
//        return total;
//    }

    public static int sumTotal(int n){
        //use a while loop
        int total, i; //declared multiple variables
        total = i = 0; //initialized multiple objects

        while(i <= n){
            total+= i++;
        }

        return total;

    }

    public static int sumEvens(int n) {
        // sum all even numbers from 2 to n
        int total, i;
        total = i = 0;

        while(i <= n){

            if(i % 2 == 0){

                total+= i ;
            }
            i++;

        }
        // to test if even n % 2 == 0

        return total;
    }

}

public class Main {
    //need to have a "main" function because your program will not run without it
    public static void main(String[] args) {
//        Dog firstDog = new Dog("white");
//        Poodle floofy = new Poodle("black");
//
//        firstDog.speak();
//        floofy.speak("Hello world");
//        System.out.println(floofy.toString());

//        System.out.println( Calc.sumTotal(6));
        System.out.println( Calc.sumEvens(8));
    }


}