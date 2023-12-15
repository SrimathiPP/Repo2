package com.perscholas.array_basics.pa_303_7_1;

import java.util.Arrays;

// Write a program where you create an integer array with a length of 5.
// Loop through the array and assign the value of the loop control
// variable (e.g., i) to the corresponding index in the array.
public class Program5 {
    public static void main(String[] args) {
int[] intArr=new int[5];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i]=i+i;
        }
        System.out.println(Arrays.toString(intArr));
    }


}
