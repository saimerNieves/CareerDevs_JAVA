package com.company;

public class Fruit extends Product{

    //Contructors
    public Fruit(){
        setName("");
        setPrice(0.00);
        setStartingQuantity(0);

    }

    public Fruit(String name,double price, int quantity){
        setName(name);
        setPrice(price);
        setStartingQuantity(quantity);
    }


}
