package com.company;

import java.text.DecimalFormat;

public class Product {


    private double price;
    private String name;
    private int totalQuantity;
    private int startingQuantity;
    private double gainedRevenue;
    private double remainingRevenue;


    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    public String toString(){
        return (
                this.name + " | Cost: " + this.price + " | totalQuatity: " + this.totalQuantity + " | remaining Revenue : "  + df.format(this.remainingRevenue) + " | Gained Revenue : "  + df.format(this.gainedRevenue)
                );
    }




    //Setters and getters
    public void setPrice(double price){
        this.price = price;
    }

    public Double getPrice(){
        return this.price;
    }




    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }



    public void setStartingQuantity(int startingQuantity){

        this.startingQuantity = startingQuantity;

        this.totalQuantity = this.startingQuantity;

        this.gainedRevenue = 0.00;

        this.remainingRevenue = (this.startingQuantity * this.price) ;

    }

    public void makeSale(int quantity){

        this.totalQuantity -= quantity;
        this.gainedRevenue += this.price * quantity;
        this.remainingRevenue-= this.price * quantity;
    }

    public void makeReturn(int quantity){
        this.totalQuantity += quantity;
        this.gainedRevenue -= this.price * quantity;
        this.remainingRevenue += this.price * quantity;
    }

    public int getTotalQuantity(){
        return this.totalQuantity;
    }
















}
