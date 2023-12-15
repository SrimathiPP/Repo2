package com.perscholas.array_basics.pa_303_7_1;

import java.util.Arrays;

//Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
// Print the array in ascending order, and print the smallest and the largest element of the array.
// The output will look like the following:
//Array in ascending order: 0, 1, 2, 4, 9, 13
//The smallest number is 0
//The biggest number is 13
public class Program9 {
    public static void main(String[] args) {
        int[] intArr = {4, 2, 9, 13, 1, 0};
        System.out.println("Before Sorting : " + Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println("After Sorting : " + Arrays.toString(intArr));
        System.out.println("Smallest Number :"+intArr[0]);
        System.out.println("Biggest Number : "+intArr[intArr.length-1]);
    }
}
