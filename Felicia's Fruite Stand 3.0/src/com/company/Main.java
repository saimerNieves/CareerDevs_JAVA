package com.company;

import java.util.ArrayList;
//AS SE Saimer Nieves - CareerDevs Student

public class Main {

    //method call displayProducts;
    public static void displayProducts(ArrayList product_List){
        for (int i = 0; i < product_List.size(); i++) {

            System.out.println(product_List.get(i));
        }
    }

    public static void displayProducts(ArrayList product_list,String type){

        System.out.println(type.toLowerCase() + " ------------ \n");
            for(int i = 0; i < product_list.size(); i++){
//
//                if((type.equals("meat"))  && (product_list.get(i) instanceof Meat)){
//
//                    System.out.println(product_list.get(i));
//                }
//                else if((type.equals("fruit")) && (product_list.get(i) instanceof Fruit)){
//
//                    System.out.println(product_list.get(i));
//                }
                switch (type.toLowerCase()){
                    case "meat" :

                        switch (String.valueOf (product_list.get(i) instanceof Meat)){
                            case "true":
                                System.out.println(product_list.get(i));
                                break;
                        }
                        break;

                    case "fruit":

                        switch (String.valueOf( product_list.get(i) instanceof Fruit )){
                            case "true":
                                System.out.println(product_list.get(i));
                                break;
                        }
                        break;
                }







//
            }



    }

    public static void displayProducts(ArrayList product_list, int i){

        System.out.println( product_list.get(i));
    }



    public static void main(String[] args) {
	// write your code here

        //Create a product list
        ArrayList<Product> product_List = new ArrayList<>();

        //3 different fruits
        Fruit banana = new Fruit("Banana",0.69,10);
        Fruit apple = new Fruit("Apple",1.50,20);
        Fruit kiwi = new Fruit("kiwi",0.99,5);


        //3  different meats
        Meat steak = new Meat("Steak",5.99,2);
        Meat chicken = new Meat("Chicken",2.99,8);
        Meat ribs = new Meat("Ribs",4.99,4);


        //adding all fruits to arrayList
        product_List.add(banana);
        product_List.add(apple);
        product_List.add(kiwi);


        //adding all meats to arrayList
        product_List.add(steak);
        product_List.add(chicken);
        product_List.add(ribs);




        //OUTPUT TESTING SECTION
        displayProducts(product_List);

        System.out.println("\n===================================");

        displayProducts(product_List,5);
        ribs.makeSale(2); //made sale
        System.out.println("\n===================================");
        ribs.makeReturn(1); //made a return
        displayProducts(product_List,5);


        System.out.println(  ribs.getTotalQuantity()); // displays method the shows totalQuantity

        System.out.println("\n===================================");
        displayProducts(product_List, "meat"); //shows all items which are instance of Meat


        System.out.println("\n===================================");
        displayProducts(product_List, "Fruit"); //shows all items which are instance of Fruit

    }
}

//AS SE Saimer Nieves - CareerDevs Student