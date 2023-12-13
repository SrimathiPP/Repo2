package com.perscholas.java_basics;

public class PracticeClass3 {
    //Write a program that declares an integer variable and a double variable, assigns numbers to each,
    // and adds them together. Assign the sum to a variable.
    // Print out the result. What variable type must the sum be?
    public static void add2DoubleInt(int a,double b){
        double sum=0;
        sum=a+b;
        System.out.println("The sum of "+a+ " and "+b+" is "+sum);
        System.out.println("The sum of "+a+ " and "+b+" is "+(a+b));// returns the sum in double data type
    }
    public static void main(String[] args) {
        add2DoubleInt(2456,654.78);
    }
}
