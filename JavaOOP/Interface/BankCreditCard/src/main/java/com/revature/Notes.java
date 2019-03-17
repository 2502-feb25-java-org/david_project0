package com.revature;

public class Notes{
    public static void main(String[] args) {
        //COLLECTIONS = arrays, collections, framework/ Collection API
        //Arrays: homogenous items and placed contiguous memory location
        int[] arr; //declare
        arr = new int[10]; //initialization
        arr[0] = 23;
        arr[1] = 4;
        arr[2] = 33;

        for (int i : arr) {
            System.out.println(arr);
            
        }
    }
}