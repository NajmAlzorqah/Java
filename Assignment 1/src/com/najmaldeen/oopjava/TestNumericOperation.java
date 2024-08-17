package com.najmaldeen.oopjava;

public class TestNumericOperation {
/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
// Declares and initializes the variable
    int choice = 3;
// switch expression value is matched with each case
    switch (choice) {
        case 1:
            System.out.println("Addition");
            break;
        case 2:
            System.out.println("Subtraction");
            break;
        case 3:
            System.out.println("Multiplication");
            break;
        case 4:
            System.out.println("Division");
            break;
        default:
            System.out.println("Invalid Choice");
    } // End of switch-case statement
}
}