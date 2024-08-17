package com.najmaldeen.oopjava;

import java.util.Scanner;
public class AcceptNumbers {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count, number; // count variable is a counter variable
        for (count = 1, number = 0; count <= 10; count++) {
// Scanner class is used to accept data from the keyboard
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number: ");
            number = input.nextInt();
            if (number == 0) {
// break statement terminates the loop
                break;
            } // End if statement
        } // End of for statement
    }
}
