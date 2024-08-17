package com.najmaldeen.oopjava;

public class FormatSpecifier {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 55 / 22;
        // Decimal integer
        System.out.printf("55/22 = %d %n", i);
        // Pad with zeros
        double q = 1.0 / 2.0;
        System.out.printf("1.0/2.0 = %09.3f %n", q);
        // Scientific notation
        q = 5000.0 / 3.0;
        System.out.printf("5000/3.0 = %7.2e %n", q);
        // Negative infinity
        q = -10.0 / 0.0;
        System.out.printf("-10.0/0.0 = %7.2e %n", q);
        // Multiple arguments, PI value, E–base of natural logarithm
        System.out.printf("pi = %5.3f, e = %5.4f %n", Math.PI, Math.E);
    }
}