package com.perscholas.array_basics.pa_303_7_1;

import java.util.Arrays;
import java.util.Scanner;

//Write some Java code that asks the user how many favorite things they have.
// Based on their answer, you should create a String array of the correct size.
// Then ask the user to enter the things and store them in the array you created.
// Finally, print out the contents of the array.
public class Program11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many favorite things they have");
        int n=sc.nextInt();
        String[] myFavList=new String[n];
        System.out.println("Enter the favorite things :");
        for (int i = 0; i < n; i++) {
            myFavList[i]=sc.next();
        }
        System.out.println("My Favorite Things are : "+ Arrays.toString(myFavList));
    }
}
