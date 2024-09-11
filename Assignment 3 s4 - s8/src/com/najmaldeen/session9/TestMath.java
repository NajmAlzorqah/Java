package com.najmaldeen.session9;

class Mathematics {

    public void divide(int num1, int num2) {
        try {
            System.out.println("Division is: " + (num1/num2));
        }
        catch(ArithmeticException e){
            System.out.println("Error: "+ e.getMessage());
        }
        System.out.println("Method execution completed");
    }
}

public class TestMath {
    public static void main(String[] args)
    {
        if(args.length==2) {
            Mathematics_2 objMath = new Mathematics_2();
            objMath.divide(Integer.parseInt(args[0]), Integer.
                    parseInt(args[1]));
        }
        else {
            System.out.println("Usage: java TestMath <number1> <number2>");
        }
    }
}