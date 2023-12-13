package com.perscholas.java_basics;

public class PracticeClass2 {
    //Write a program that declares two double variables,
    // assigns a number to each, and adds them together. Assign the sum to a variable. Print out the result.
    public static void add2Double(double a,double b){
        double sum=0;
        sum=a+b;
        System.out.println("The sum of "+a+ " and "+b+" is "+sum);
    }
    public static void main(String[] args) {
        add2Double(345.789,54554.325);

    }
}
