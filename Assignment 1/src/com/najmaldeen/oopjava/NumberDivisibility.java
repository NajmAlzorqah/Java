package com.najmaldeen.oopjava;

import java.util.Scanner;
public class NumberDivisibility {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Scanner class is used to accept values from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = input.nextInt();
// Checks whether a number is divisible by 3
        if (num % 3 == 0) {
            System.out.println("Inside Outer if Block");
// Inner if statement checks if number is divisible by 5
            if (num % 5 == 0) {
                System.out.println("Number is divisible by 3 and 5");
            } else {
                System.out.println("Number is divisible by 3, but not by 5");
            } // End of inner if-else statement
        }
        else {
            System.out.println("Number is not divisible by 3");
        } // End of outer if-else statement
    }
}
