package com.perscholas.string_functions;

public class ReplaceAllDemo {
    public static void main(String[] args) {
        String str1 = "Java123345is456fun";

        // regex for sequence of digits
        String regex = "\\d+";

        // replace all occurrences of numeric
        // digits by a space
        System.out.println(str1.replaceAll(regex, " "));
    }

}
