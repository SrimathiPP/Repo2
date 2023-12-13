package com.perscholas.java_basics;

public class PracticeClass7 {
    //Write a program that declares a named constant and uses it in a calculation. Print the result.
    final static double pi=3.12;
    final static int radius=5;
    public static void calculateAreaOfCircle(){
        double area=pi*radius*radius;
        System.out.println("Area of circle  has radius "+radius+ " is  "+area);
    }
    public static void main(String[] args) {
       calculateAreaOfCircle();
    }
}
