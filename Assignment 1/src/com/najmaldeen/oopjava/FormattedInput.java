package com.najmaldeen.oopjava;

import java.util.*;
public class FormattedInput {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creates an object and passes the inputstream object
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
// Accepts integer value from the user
        int intValue = s.nextInt();
        System.out.println("Enter a decimal number:");
        // Accepts integer value from the user
        float floatValue = s.nextFloat();
        System.out.println("Enter a String value");
        // Accepts String value from the user
        String strValue = s.next();
        System.out.println("Values entered are: ");
        System.out.println(intValue + " " + floatValue + " " + strValue);
    }
}
