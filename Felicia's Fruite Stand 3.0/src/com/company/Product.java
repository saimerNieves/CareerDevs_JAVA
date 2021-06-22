package com.company;
//AS SE Saimer Nieves - CareerDevs Student
import java.text.DecimalFormat;

public class Product {

    //PROPERTIES ===================================================================================
    private double price;
    private String name;
    private int totalQuantity;
    private int startingQuantity;
    private double gainedRevenue;
    private double remainingRevenue;


    //Constructors
    public Product(){
        setName("");
        setPrice(0.00);
        setStartingQuantity(0);
    }

    public Product(String name,double price, int quantity){
        setName(name);
        setPrice(price);
        setStartingQuantity(quantity);
    }









    //Decimal pattern to display dollars value
    private static DecimalFormat df = new DecimalFormat("0.00");

    //Over ride toString() method to print info
    @Override
    public String toString(){
        return (
                this.name + " | Cost: $" + this.price + " | totalQuatity: " + this.totalQuantity + " | remaining Revenue : $"  + df.format(this.remainingRevenue) + " | Gained Revenue : $"  + df.format(this.gainedRevenue)
                );
    }




    //Setters and getters ========================================================================================
    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        }else{

            System.out.println("\nPlease type a price greater than 0\n");
        }

    }

    public Double getPrice(){
        return this.price;
    }

    public void setName(String name){
        if(name.length() > 0){
            this.name = name;
        }else{
            this.name = null;
            System.out.println("\nPlease type a name greater than 0 characters\n");
        }

    }

    public String getName(){
        return this.name;
    }




    //METHODS ================================================================
    public void setStartingQuantity(int startingQuantity){

        if(startingQuantity > 0){

            this.startingQuantity = startingQuantity;

            this.totalQuantity = this.startingQuantity;

            this.gainedRevenue = 0.00;

            this.remainingRevenue = (this.startingQuantity * this.price);

        }else{
            System.out.println("\nPlease insert a quantity greater than 0\n");
        }
    }

    public void makeSale(int quantity){

        if((this.totalQuantity - quantity) >= 0){
            this.totalQuantity -= quantity;
            this.gainedRevenue += this.price * quantity;
            this.remainingRevenue-= this.price * quantity;
        }else {
            System.out.println("Low Quantity: Can't make Sale ! We have Stocked :" + this.totalQuantity + ", and you requested : " + quantity );
        }
    }

    public void makeReturn(int quantity){
        if((this.gainedRevenue - ( this.price * quantity)) >= 0){

            this.totalQuantity += quantity;
            this.gainedRevenue -= this.price * quantity;
            this.remainingRevenue += this.price * quantity;

        }else{
            System.out.println("Returning TOO MANY items we didnt sell");
        }
    }

    public int getTotalQuantity(){
        return this.totalQuantity;
    }

}
//AS SE Saimer Nieves - CareerDevs Student
