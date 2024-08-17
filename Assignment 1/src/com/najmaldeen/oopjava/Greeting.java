package com.najmaldeen.oopjava;

public class Greeting {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// String declaration
        String day = "Monday";
        String hour = "am";// Outer switch statement
        switch (day) {
            case "Sunday":
                System.out.println("Sunday is a Holiday...");
// Inner switch statement
                switch (hour) {
                    case "am":
                        System.out.println("Good Morning");
                        break;
                    case "pm":
                        System.out.println("Good Evening");
                        break;
                } // End of inner switch-case statement
                break; // Terminates the outer case statement
            case "Monday":
                System.out.println("Monday is a Working Day...");
                switch (hour) {
                    case "am":
                        System.out.println("Good Morning");
                        break;
                    case "pm":
                        System.out.println("Good Evening");
                        break;
                } // End of inner switch-case statement
                break;
            default:
                System.out.println("Invalid Day");
        } // End of the outer switch-case statement
    }
}
