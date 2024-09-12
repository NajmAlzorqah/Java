package com.najmaldeen.session3;

public class WhileStatement {
    public static void main(String[] args) {

        int num = 1;

        int product = 0;

        while (num <= 5) {
            product = num * 10;
            System.out.printf("\n %d * 10 = %d", num, product);
            num++;
        }
        System.out.println("\n Outside the Loop");
    }
}
