package com.company;

import com.sun.jdi.Value;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

        Object keyArray = phoneNumberDictionary.keySet().toArray();

        Object valueArray = phoneNumberDictionary.values().toArray();


        for (int i = 0; i < phoneNumberDictionary.size(); i++){

            System.out.print(keyArray + " " + valueArray[i]);

        }






        buff.close();
        //Phone number map
//
//        Map<String, String> phoneNumberMap = new HashMap<>();
//        phoneNumberMap.put("Saimer","401-999-9999");
//        phoneNumberMap.put("Luis","498-888-5415");
//
//        System.out.println( phoneNumberMap.get("Saimer"));
//
//        System.out.println( phoneNumberMap.keySet());
//
//        System.out.println(phoneNumberMap.values());
//
//        System.out.println(phoneNumberMap.size());

    }
}
