package com.najmaldeen.session3;

public class TestLabeledBreak {
    public static void main(String[] args) {
        int i;
        outer:
        for (i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("Hello");
                break outer; }

            System.out.println("This is the outer loop.");
        }
        System.out.println("Good - Bye");
    }
}
