package com.najmaldeen.session4;

public class Rectangle2 {
    int width;
    int height;
    /**
     * A default constructor for Rectangle class
     */
    Rectangle2() {
        System.out.println("Constructor Invoked...");
        width = 10;
        height = 10;
    }
    /**
     * A parameterized constructor with two parameters
     * @param wid will store the width of the rectangle
     * @param heig will store the height of the rectangle
     */

    Rectangle2 (int wid, int heig) {
        System.out.println("Parameterized Constructor");
        width = wid;
        height = heig;
    }
    /**
     * This method displays the dimensions of the Rectangle object
     */
    void displayDimensions(){
        System.out.println("Width: " + width);
        System.out.println("Width: " + height);
    }
}
