package com.najmaldeen;

import java.util.Scanner;

public class Sum {
    Scanner scanner = new Scanner(System.in);

    void sum(int times) {

        for (int i = 0; i < times; i++) {
            System.out.println("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = scanner.nextInt();
            System.out.printf("The sum is :%d \n", num1 + num2);
        }
    }
}
