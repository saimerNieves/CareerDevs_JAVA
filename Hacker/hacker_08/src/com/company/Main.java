package com.company;

import com.sun.jdi.Value;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        Map<String,String> phoneNumberDictionary = new HashMap<>();

        int input_length = Integer.parseInt( buff.readLine().trim());

        for (int i = 0 ; i < input_length; i++){

            String[] key_value_Inputed = buff.readLine().trim().split(" ");

            String name_Key = key_value_Inputed[0];

            String phoneNumber_Value = key_value_Inputed[1];

            phoneNumberDictionary.put(name_Key,phoneNumber_Value);
        }


        ArrayList<String> data_Keys = new ArrayList<>(phoneNumberDictionary.keySet());

        ArrayList<String> data_values =new ArrayList<> (phoneNumberDictionary.values());

//        System.out.println(data_Keys.contains("saimer"));


        for (int i = 0; i < input_length; i++){


            String searching_str = buff.readLine().toLowerCase().trim();

            for (int j = 0 ; j < phoneNumberDictionary.size(); j++){



                String oneKey = data_Keys.get(j);

                if(oneKey.equals(searching_str)){
                    System.out.print( data_Keys.get(j) + "=");
                    System.out.println( data_values.get(j));
                    break;
                }
                else{

                    if( j == (phoneNumberDictionary.size() - 1)){

                        System.out.println("Not found");
                    }
                }


            }


        }



        buff.close();


    }
}
