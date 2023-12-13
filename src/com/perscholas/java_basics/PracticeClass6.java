package com.perscholas.java_basics;

public class PracticeClass6 {
//    Write a program that declares two integer variables, x and y, and assigns the number 5 to x and
//    the number 6 to y. Declare a variable q and assign y/x to it and print q. Now, cast y to a double
//    and assign it to q. Print q again.

public static void divide2DoubleNum(){
    int x=5;
    int y=6;
    int q=y/x;
    System.out.println(y+" / "+ x +" = "+q);  //we get the result in integer data type
    System.out.println("After typecasting the  integer y to double ");
    System.out.println( y+" / "+ x +" = "+((double)y)/x);//we get the result in integer data type
}
public static void main(String[] args) {
divide2DoubleNum();
}

}
