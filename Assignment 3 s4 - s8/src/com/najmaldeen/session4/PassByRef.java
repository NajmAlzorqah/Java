package com.najmaldeen.session4;

// Define another class PassByRef
public class PassByRef{
    // Method to calculate area of a circle that takes object of class
// Circle as a parameter
    public void calcArea(Circle objPi, double rad){
        // Use getPI() method to retrieve the value of PI
        double area= objPi.getPI() * rad * rad;
        // Print the value of area of circle
        System.out.println("Area of the circle is "+ area);
    }

    public static void main(String[] args){
// Instantiate the PassByRef class
        PassByRef p1 = new PassByRef();
// Invoke the calcArea() method with object of class Circle as
        // a parameter
        p1.calcArea(new Circle(), 2);
    }
}