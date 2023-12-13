package com.perscholas.java_basics;

public class PracticeClass {
    //Write a program that declares two integer variables, assigns an integer to each,
    // and adds them together. Assign the sum to a variable. Print out the result.
    public static void add2Integer(int a,int b){
        int sum=0;
        sum=a+b;
        System.out.println("The sum of "+a+ " and "+b+" is "+sum);
    }

    public static void main(String[] args) {
        add2Integer(5,7);
    }
}
