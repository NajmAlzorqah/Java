package com.najmaldeen.session5;

public class AutoUnbox {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Character chBox = 'A'; // Autoboxing a character
        char chUnbox = chBox; // Unboxing a character
        // Print the values
        System.out.println("Character after autoboxing is:"+ chBox) ;
        System.out.println("Character after unboxing is:" + chUnbox);
    }
}
