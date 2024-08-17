package com.najmaldeen.oopjava;

import java.util.Scanner;

public class Main {
//    // page 64 Code Snippet 10
//    enum Direction {
//        East, West, North, South
//    }
    //====================================================
//        // page 97 Code Snippet 9 :

    enum Cards {
        Spade, Heart, Diamond, Club
    }


    public static void main(String[] args) {
//        // Page 54
//        int x;
//        x = 10;
//        {
//            int y =20;
//            System.out.println("x and y:" + x + " " + y);
//            //calculate value for variable x
//            x= y *2;
//
//        }
//        // y =100; // Error y is not known here
//        //x is accessible
//        System.out.println(" x is: " +x );
        //====================================================
//        // page 64 Code Snippet 10

//        // Declares a variable of type Direction
//        Direction direction;
//        // Instantiate the enum Direction
//        direction = Direction.East;
//// Prints the value of enum
//        System.out.println("Value: " + direction);

        //====================================================
//        // page 65 Code Snippet 11:
//        int num1 = 5;
//        int num2 = 10;
//        int sum = num1 + num2;
//        System.out.print("The sum of ");
//        System.out.print(num1);
//        System.out.print(" and ");
//        System.out.print(num2);
//        System.out.print(" is ");
//        System.out.print(sum);
//        System.out.println(".");
//        int num3 = 2;
//        sum = num1 + num2 + num3;
//        System.out.println("The sum of " + num1 + ", " + num2 + " and " + num3 + " is " + sum + ".");
        //====================================================
//        // page 66 + 67 Code Snippet 12:
//
//        int i = 55 / 22;
//        // Decimal integer
//        System.out.printf("55/22 = %d %n", i);
//        // Pad with zeros
//        double q = 1.0 / 2.0;
//        System.out.printf("1.0/2.0 = %09.3f %n", q);
//        // Scientific notation
//        q = 5000.0 / 3.0;
//        System.out.printf("5000/3.0 = %7.2e %n", q);
//        // Negative infinity
//        q = -10.0 / 0.0;
//        System.out.printf("-10.0/0.0 = %7.2e %n", q);
//        // Multiple arguments, PI value, E–base of natural logarithm
//        System.out.printf("pi = %5.3f, e = %5.4f %n", Math.PI, Math.E);
        //====================================================
        // page 69 Code Snippet 14 :

//        // Creates an object and passes the inputstream object
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter a number:");
//// Accepts integer value from the user
//        int intValue = s.nextInt();
//        System.out.println("Enter a decimal number:");
//        // Accepts integer value from the user
//        float floatValue = s.nextFloat();
//        System.out.println("Enter a String value");
//        // Accepts String value from the user
//        String strValue = s.next();
//        System.out.println("Values entered are: ");
//        System.out.println(intValue + " " + floatValue + " " + strValue);
        //====================================================
//        // page 84 Code Snippet 1 :
//
//        int first = 400, second = 700, result;
//        result = first + second;
//        // Evaluates the value of result variable
//        if (result > 1000) {
//            second = second + 100;
//        }
//        System.out.println("The value of second is " + second);
        //====================================================
//        // page 87 + 88 Code Snippet 4 :
//
//        // Scanner class is used to accept values from the user
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a Number: ");
//        int num = input.nextInt();
//        // Checks whether a number is divisible by 3
//        if (num % 3 == 0) {
//            System.out.println("Inside Outer if Block");
//        // Inner if statement checks if number is divisible by 5
//            if (num % 5 == 0) {
//                System.out.println("Number is divisible by 3 and 5");
//            } else {
//                System.out.println("Number is divisible by 3, but not by 5");
//            } // End of inner if-else statement
//        }
//        else {
//            System.out.println("Number is not divisible by 3");
//        } // End of outer if-else statement

        //====================================================
//       // page 93 Code Snippet 6 :
//        // Declares and initializes the variable
//        int choice = 3;
//        // switch expression value is matched with each case
//        switch (choice) {
//            case 1:
//                System.out.println("Addition");
//                break;
//            case 2:
//                System.out.println("Subtraction");
//                break;
//            case 3:
//                System.out.println("Multiplication");
//                break;
//            case 4:
//                System.out.println("Division");
//                break;
//            default:
//                System.out.println("Invalid Choice");
//        } // End of switch-case statement
        //====================================================
//        // page 94 Code Snippet 7 :
//        int month = 5;
//        int year = 2001;
//        int numDays = 0;
//          // Cases are executed until a break statement is encountered
//        switch (month) {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                numDays = 31;
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                numDays = 30;
//                break;
//            case 2:
//                if (year % 4 == 0) {
//                    numDays = 29;
//                } else {
//                    numDays = 28;
//                }
//                break;
//            default:
//                System.out.println("Invalid Month");
//        } // End of switch-case statement
//        System.out.println("Month: " + month);
//        System.out.println("Number of Days: " + numDays);
        //====================================================
//        // page 96 Code Snippet 8 :
//        String day = "Monday";
//// switch statement contains an expression of type String
//        switch (day) {
//            case "Sunday":
//                System.out.println("First day of the Week");
//                break;
//            case "Monday":
//                System.out.println("Second Day of the Week");
//                break;
//            case "Tuesday":
//                System.out.println("Third Day of the Week");
//                break;
//            case "Wednesday":
//                System.out.println("Fourth Day of the Week");
//                break;
//            case "Thursday":
//                System.out.println("Fifth Day of the Week");
//                break;
//            case "Friday":
//                System.out.println("Sixth Day of the Week");
//                break;
//            case "Saturday":
//                System.out.println("Seventh Day of the Week");
//                break;
//            default:
//                System.out.println("Invalid Day");
//        } // End of switch-case statement
        //====================================================
//        // page 97 Code Snippet 9 :
//        Cards card = Cards.Diamond;
//// enum variable is used to control a switch statement
//        switch (card) {
//            case Spade:
//                System.out.println("SPADE");
//                break;
//            case Heart:
//                System.out.println("HEART");
//                break;
//            case Diamond:
//                System.out.println("DIAMOND");
//                break;
//            case Club:
//                System.out.println("CLUB");
//                break;
//        } // End of switch-case statement
        //====================================================
//        // page 98 Code Snippet 10 :
//        // String declaration
//        String day = "Monday";
//        String hour = "am";
//        // Outer switch statement
//        switch (day) {
//            case "Sunday":
//                System.out.println("Sunday is a Holiday...");
//                // Inner switch statement
//                switch (hour) {
//                    case "am":
//                        System.out.println("Good Morning");
//                        break;
//                    case "pm":
//                        System.out.println("Good Evening");
//                        break;
//                } // End of inner switch-case statement
//                break; // Terminates the outer case statement
//            case "Monday":
//                System.out.println("Monday is a Working Day...");
//                switch (hour) {
//                    case "am":
//                        System.out.println("Good Morning");
//                        break;
//                    case "pm":
//                        System.out.println("Good Evening");
//                        break;
//                } // End of inner switch-case statement
//                break;
//            default:
//                System.out.println("Invalid Day");
//        } // End of the outer switch-case statement

        //====================================================
//        // page 102 Code Snippet 11 :
//        // Variable, num acts as a counter variable
//        int num = 1;
//        // Variable, product will store the result
//        int product = 0;
//        // Tests the condition at the beginning of the loop
//        while (num <= 5) {
//            product = num * 10;
//            System.out.printf("\n %d * 10 = %d", num, product);
//            num++; // Equivalent to n = n + 1
//        } // Moves the control back to the while statement
//        // Statement gets printed on loop termination
//        System.out.println("\n Outside the Loop");
        //====================================================
//        // page 102 Code Snippet 11 :

//        int num = 1, sum = 0;
//        do {
//            sum = sum + num;
//            num++;
//        } while (num <= 10);
//        System.out.printf("Sum of 10 Numbers: %d\n", sum);

        //====================================================
//        // page 108 Code Snippet 16 :
//        // Use of Comma Operator in for Statement
//        int i, j;
//        int max = 10;
//        /*
//         * The initialization and increment/decrement section includes
//         * more than one variable
//         */
//        for (i = 0, j = max; i <= max; i++, j--) {
//            System.out.printf("\n%d + %d = %d", i, j, i + j);
//        }
        //====================================================
//        // page 113 Code Snippet 19 :
//        int count, number; // count variable is a counter variable
//        for (count = 1, number = 0; count <= 10; count++) {
//        // Scanner class is used to accept data from the keyboard
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter a number: ");
//            number = input.nextInt();
//            if (number == 0) {
//        // break statement terminates the loop
//                break;
//            } // End if statement
//        } // End of for statement

        //====================================================
//        // page 114 Code Snippet 20 :
//        int count, square, cube;
//        // Loop continues till the remainder of the division is 0
//        for (count = 1; count < 300; count++) {
//            if (count % 3 == 0) {
//                continue;
//            }
//            square = count * count;
//            cube = count * count * count;
//            System.out.printf("\nSquare of %d is %d and Cube is %d", count, square,
//                    cube);
//        } // End of the for loop

        //====================================================
//        // page 116 Code Snippet 21 :
//        int i;
//        outer:
//        for (i = 0; i < 5; i++) {
//            if (i == 2) {
//                System.out.println("Hello");
//                 // Break out of outer loop
//                break outer; }
//            System.out.println("This is the outer loop.");
//        }
//        System.out.println("Good - Bye");
        //====================================================
    }
}