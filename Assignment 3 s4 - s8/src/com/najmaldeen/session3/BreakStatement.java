package com.najmaldeen.session3;

import java.util.Scanner;

public class BreakStatement {
    public static void main(String[] args) {
        int count, number;
        for (count = 1, number = 0; count <= 10; count++) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number: ");
            number = input.nextInt();
            if (number == 0) {

                break;
            }
        }
    }
}
