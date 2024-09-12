package com.najmaldeen.session3;

public class ForLoopWithComma {
    public static void main(String[] args) {
        int i, j;
        int max = 10;

        for (i = 0, j = max; i <= max; i++, j--) {
            System.out.printf("\n%d + %d = %d", i, j, i + j);
        }
    }
}
