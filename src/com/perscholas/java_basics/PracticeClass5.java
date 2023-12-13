package com.perscholas.java_basics;

public class PracticeClass5 {

    //Write a program that declares two double variables, assigns a number to each,
    // and divides the larger by the smaller number. Assign the result to a variable.
    // Print out the result. Now, cast the result to an integer. Print out the result again.
    public static void divide2DoubleNum(double a,double b){
        System.out.println(a+" / "+ b +" = "+(a/b));//we get the result in double data type
        System.out.println("After typecasting the double result to integer  "+a+" / "+ b +" = "+(int)(a/b));//we get the result in integer data type
        //System.out.println(b+" / "+ a +" = "+(double)b/a); // we have to typecast the result
    }

    public static void main(String[] args) {
divide2DoubleNum(234.678,34.2);
    }
}
