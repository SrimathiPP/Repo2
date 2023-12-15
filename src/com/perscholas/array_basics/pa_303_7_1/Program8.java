package com.perscholas.array_basics.pa_303_7_1;

import java.util.Arrays;

// Write a program that creates a String array of 5 elements and swaps
// the first element with the middle element without creating a new array.
public class Program8 {
    public static void main(String[] args) {
        int[] intArray={1,2,3,4,5};
        System.out.println("Before Swapping : "+ Arrays.toString(intArray));
        int temp=intArray[0];
        intArray[0]=intArray[intArray.length/2];
        intArray[intArray.length/2]=temp;
        System.out.println("After Swapping : "+ Arrays.toString(intArray));

    }
}
