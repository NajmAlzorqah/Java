package com.najmaldeen.oopjava;

public class NumberRoot {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count, square, cube;
// Loop continues till the remainder of the division is 0
        for (count = 1; count < 300; count++) {
            if (count % 3 == 0) {
                continue;
            }
            square = count * count;
            cube = count * count * count;
            System.out.printf("\nSquare of %d is %d and Cube is %d", count, square,
                    cube);
        } // End of the for loop
    }
}
