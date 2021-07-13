package com.company;

import com.company.movingVehicles.Car;
import com.company.vehicle_attriubute.Engine;
import com.company.vehicle_attriubute.Tire;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Engine electricEngine = new Engine("electric");
        Engine gasEngine = new Engine("Gas");

        Tire frontLeft = new Tire(50,35);
        Tire frontRight = new Tire(50,39);
        Tire backLeft = new Tire(50,34);
        Tire backRight = new Tire(50,37);

        ArrayList<Tire> malibuTires = new ArrayList<>();
        malibuTires.add(frontLeft);
        malibuTires.add(frontRight);
        malibuTires.add(backLeft);
        malibuTires.add(backRight);


        Car malibu = new Car(electricEngine,malibuTires,4);

    }
}
