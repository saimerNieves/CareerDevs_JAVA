package com.company;

public class Meat extends Product{

    //Contructors
    public Meat(){
        setName("");
        setPrice(0.00);
        setStartingQuantity(0);
    }

    public Meat(String name,double price, int quantity){
        setName(name);
        setPrice(price);
        setStartingQuantity(quantity);
    }
}
