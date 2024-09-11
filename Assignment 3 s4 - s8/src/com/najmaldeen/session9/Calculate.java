package com.najmaldeen.session9;

public class Calculate {

    public static void main(String[] args) {
        if (args.length == 2){
            try {
                int num3 = Integer.parseInt(args[0]) / Integer.parseInt(args[1]);
                System.out.println("Division is: "+num3);
            }
            catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
            catch (NumberFormatException e){
                System.out.println("Error: Required Integer found String:" +
                        e.getMessage());
            }
            catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        else {
            System.out.println("Usage: java Calculate <number1> <number2>");
        }
    }
}