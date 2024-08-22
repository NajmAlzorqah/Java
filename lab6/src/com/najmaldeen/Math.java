package com.najmaldeen;

public class Math {
    public void divide(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {

            throw new ArithmeticException("/ by zero");
        } else {
            System.out.println("Division is: " + (num1 / num2));
        }

        System.out.println("The rest of the code ");


//        try {
//
//            System.out.println("Division is: " + (num1 / num2));
//        } catch (ArithmeticException e) {
//
//            System.out.println("Error: " + e.getMessage());
//        }
//
//        System.out.println("The rest of the code");
    }
}