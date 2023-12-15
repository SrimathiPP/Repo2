package com.perscholas.string_functions.Practice;

import java.util.Scanner;
public class Program1 {


        public static void getSmallestAndLargest(String s, int k) {
            String smallest = "";
            String largest = "";

            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length 'k'
            String[] strArray=new String[s.length()-k] ;
            int pointer=0;
            for (int i = 0; i <= s.length()-k; i++) {
                strArray[pointer]=s.substring(i,i+k);
                pointer+=1;
            }
            for (int i = 0; i < strArray.length; i++) {
                System.out.print(strArray[i]+"  ");
            }

            //return smallest + "\n" + largest;
        }

    public static void main(String[] args) {
        getSmallestAndLargest("welcometojava",3);
    }
}
