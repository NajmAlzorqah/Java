package com.najmaldeen.session3;

public class StringSwitchCase {
    public static void main(String[] args) {
        String day = "Monday";

        switch (day) {
            case "Sunday":
                System.out.println("First day of the Week");
                break;

            case "Monday":
                System.out.println("Second Day of the Week");
                break;

            case "Tuesday":
                System.out.println("Third Day of the Week");
                break;

            case "Wednesday":
                System.out.println("Fourth Day of the Week");
                break;

            case "Thursday":
                System.out.println("Fifth Day of the Week");
                break;

            case "Friday":
                System.out.println("Sixth Day of the Week");
                break;

            case "Saturday":
                System.out.println("Seventh Day of the Week");
                break;

            default:
                System.out.println("Invalid Day");
        }
    }
}
