package com.perscholas.array_basics;

import java.util.Arrays;

public class PracticeClass {

        public static void main(String[] args)
        {
            // Our arr contains 8 elements
            int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
            double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
            Arrays.sort(numbers);

            char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
            Arrays.sort(chars);

            Arrays.sort(arr);
            System.out.println("Modified String arr[] : "+ Arrays.toString(arr));
            System.out.println("Modified Integer arr[] : "+ Arrays.toString(numbers));
            System.out.println("Modified Double arr[] : "+ Arrays.toString(chars));
        }


}
