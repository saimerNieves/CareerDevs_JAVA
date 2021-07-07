package com.company;


public class Printer <T> {
    /**
     *    Method Name: printArray
     *    Print each element of the generic array on a new line. Do not return anything.
     *    @param A generic array
     **/
    public void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }
}