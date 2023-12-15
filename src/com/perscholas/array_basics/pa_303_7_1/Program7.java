package com.perscholas.array_basics.pa_303_7_1;
//Write a program where you create an array of 5 elements. Loop through the array and print
// the value of each element, except for the middle (index 2) element.
public class Program7 {
    public static void main(String[] args) {
    int[] intArr=new int[]{1,2,3,4,5};
        for (int i = 0; i < intArr.length; i++) {
            if(i!=intArr.length/2) {
                System.out.println("Array value at " + i + " position is " + intArr[i]);
            }
        }
    }
}
