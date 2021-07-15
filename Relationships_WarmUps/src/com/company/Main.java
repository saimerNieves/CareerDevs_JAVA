package com.company;

//importing packages
import com.company.movingVehicles.*;

//importing vehicle attribute
import com.company.vehicle_attriubute.*;

//importing arraylist
import java.util.ArrayList;


//create instances of vehicles using is has relationship
public class Main {

    public static void main(String[] args) {
	// write your code here

        Engine electricEngine = new Engine("electric");
        Engine gasEngine = new Engine("Gas");

        Tire frontLeft = new Tire(50,35);
        Tire frontRight = new Tire(50,39);
        Tire backLeft = new Tire(50,34);
        Tire backRight = new Tire(50,37);

        //Car
        //TODO Add tires using add tires method
        ArrayList<Tire> malibuTires = new ArrayList<>();
        malibuTires.add(frontLeft);
        malibuTires.add(frontRight);
        malibuTires.add(backLeft);
        malibuTires.add(backRight);


        Car malibu = new Car(electricEngine,2);

        Engine boatEngine = new Engine("Gas");
        Boat yatch = new Boat(boatEngine,150);




        Tire front1 = new Tire(70,75);
        Tire front2= new Tire(70,74);
        Tire left1 = new Tire(70,73);
        Tire left2 = new Tire(70,77);
        Tire right1 = new Tire(70,77);
        Tire right2 = new Tire(70,75);

        ArrayList<Tire> planeTires = new ArrayList<>();
        planeTires.add(front1);
        planeTires.add(front2);
        planeTires.add(left1);
        planeTires.add(left2);
        planeTires.add(right1);
        planeTires.add(right2);

        Engine planeEngine = new Engine("Gas");
        Plane boeingPlane = new Plane(planeEngine,planeTires,2);

        Passenger sainier = new Passenger("Sainier", 90);
        Passenger saimer = new Passenger("saimer", 150);
        Passenger batman = new Passenger("batman", 75);

        malibu.addPassenger(sainier);
        malibu.addPassenger(saimer);
        malibu.addPassenger(batman);

        yatch.addPassenger(sainier);
        yatch.addPassenger(batman);

        boeingPlane.addPassenger(sainier);
        boeingPlane.addPassenger(batman);
        boeingPlane.addPassenger(saimer);

        System.out.println(boeingPlane.engine.isOn);
        boeingPlane.engine.turnOn();
//        boeingPlane.engine.turnOff();
        System.out.println(boeingPlane.engine.isOn);

        System.out.println(yatch.passengerArrayList.size());
        yatch.addPassenger(saimer);
        yatch.addPassenger(sainier);
        System.out.println(yatch.passengerArrayList.size());
        yatch.removePassenger(sainier);
        yatch.removePassenger(saimer);
        System.out.println(yatch.passengerArrayList.size());

        System.out.println(boeingPlane.tires.size());

        boeingPlane.removeTire(left1);

        System.out.println(boeingPlane.tires.size());

        Tire newFreeTire = new Tire(50,55);

        boeingPlane.addTire(newFreeTire);

        System.out.println(boeingPlane.tires.size());

    }
}
