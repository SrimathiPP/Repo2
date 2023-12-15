package com.perscholas.array_basics.pa_303_7_1;

import java.util.Arrays;

//Write a program that creates an array of String type and initializes it with the
// strings “red,” “green,” “blue,” and “yellow.” Print out the array length.
// Make a copy using the clone( ) method. Use the Arrays.toString( )
// method on the new array to verify that the original array was copied.
public class Program3 {


    public static void main(String[] args) {
        String[] strArray={"red","green","blue","yellow"};
        System.out.println("Length of String Array : "+strArray.length);
        String[] duplicateStrArray=strArray.clone();
        System.out.println("Array Copied Using clone() : "+ Arrays.toString(duplicateStrArray));
    }

}
