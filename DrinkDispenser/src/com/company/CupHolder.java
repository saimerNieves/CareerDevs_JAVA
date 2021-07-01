package com.company;

public class CupHolder {

    private final double volume_Per_Cup;
    private int quantity;

    //Constructors

    public CupHolder(double volume_Per_Cup, int quantity){
        this.volume_Per_Cup = volume_Per_Cup;
        setQuantity(quantity);
    }


    //SETTERS AND GETTERS
    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }


    public double getVolume_Per_Cup() {
        return volume_Per_Cup;
    }


    //METHODS
    public double dispenseCup(){

        setQuantity(getQuantity() - 1);
        return getVolume_Per_Cup();
    }

    public void refill(int amount){

        setQuantity( getQuantity() + amount);
    }

}
