package com.perscholas.string_functions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        int i = scan.nextInt();
        double d=scan.nextDouble();
        String s=scan.nextLine();
        String s2=scan.nextLine();
        System.out.println(s);
        // Write your code here.


        System.out.println("String: " + s);
        System.out.println("String2: " + s2);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}
