package com.perscholas.array_basics.pa_303_7_1;
//Write a program that creates an integer array with 5 elements (i.e., numbers).
// The numbers can be any integers.  Print out the value at the first index and the last index
// using length - 1 as the index. Now try printing the value at index = length
// (e.g., myArray[myArray.length] ).  Notice the type of exception which is produced.
// Now try to assign a
// value to the array index 5. You should get the same type of exception.
public class Program4 {
    public static void main(String[] args) {
int[] intArray=new int[]{1,2,3,4,5};
        System.out.println("First Element : "+intArray[0]);
        System.out.println("First Element : "+intArray[intArray.length-1]);
        //System.out.println("First Element : "+intArray[intArray.length]);//getting ArrayIndexOutOfBoundsException
        //System.out.println("First Element : "+intArray[5]);//getting ArrayIndexOutOfBoundsException


    }
}
