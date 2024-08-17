package com.najmaldeen.oopjava;

public class PrintMultiplesWithWhileLoop {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Variable, num acts as a counter variable
        int num = 1;
// Variable, product will store the result
        int product = 0;
// Tests the condition at the beginning of the loop
        while (num <= 5) {
            product = num * 10;
            System.out.printf("\n %d * 10 = %d", num, product);
            num++; // Equivalent to n = n + 1
        } // Moves the control back to the while statement
// Statement gets printed on loop termination
        System.out.println("\n Outside the Loop");
    }
}
