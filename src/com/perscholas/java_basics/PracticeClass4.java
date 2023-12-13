package com.perscholas.java_basics;

public class PracticeClass4 {
//   Write a program that declares two integer variables, assigns an integer to each, and divides
//   the larger number by the smaller number. Assign the result to a variable. Print out the result.
//   Now change the larger number to a decimal. What happens? What corrections are needed?
public static void divide2Num(int a,int b){
    System.out.println(a+" / "+ b +" = "+a/b);
    System.out.println((double)a+" / "+ b +" = "+((double)a)/b);//we get the result in double data type
    //System.out.println(b+" / "+ a +" = "+(double)b/a); // we have to typecast the result
}

    public static void main(String[] args) {
    divide2Num(365,5);
}

}
