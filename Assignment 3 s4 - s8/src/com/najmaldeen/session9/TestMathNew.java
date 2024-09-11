package com.najmaldeen.session9;

class Mathematics_2 {

    public void divide(int num1, int num2) throws ArithmeticException {
        if(num2==0) {
            throw new ArithmeticException("/ by zero");
        }
        else {
            System.out.println("Division is: " + (num1/num2));
        }
        System.out.println("Method execution completed");
    }
}
public class TestMathNew{

    public static void main(String[] args) {
        if(args.length==2) {
            Mathematics_2 objMath = new Mathematics_2();
            try {
                objMath.divide(Integer.parseInt(args[0]), Integer.
                        parseInt(args[1]));
            }
            catch(ArithmeticException e) {
                System.out.println("Error: "+ e.getMessage());
            }
        }
        else{
            System.out.println("Usage: java Mathematics <number1> <number2>");
        }
        System.out.println("Back to Main");
    }
}
