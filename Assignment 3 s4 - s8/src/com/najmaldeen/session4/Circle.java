package com.najmaldeen.session4;

public class Circle {
    private float rad; // Variable to store radius of a circle
    private float PI; // Variable to store value of PI
    /**
     * No-argument constructor
     *
     */
    public Circle(){
        PI = 3.14f;
    }
    public double getPI(){
        return PI;
    }
    /**
     * Overloaded constructor
     *
     * @param r a float variable to store the value of radius
     */
    public Circle(float r) {
        this(); // Invoke the no-argument constructor
        rad = r;
    }

}



