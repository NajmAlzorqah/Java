package com.najmaldeen.oopjava;

    public class EnumDirection {
        /**
         * Declares an enumeration
         */
        enum Direction {
            East, West, North, South
        }
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // Declares a variable of type Direction
            Direction direction;
            // Instantiate the enum Direction
            direction = Direction.East;
// Prints the value of enum
            System.out.println("Value: " + direction);
        }
    }

