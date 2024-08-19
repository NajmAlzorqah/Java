package com.najmaldeen.session4;

public class RectangleInstances {

    public static void main(String[] args) {
        // Declare and initialize two objects for Rectangle class
        Rectangle2 objRec1 = new Rectangle2(10, 20);
        Rectangle2 objRec2 = new Rectangle2(6, 9);
        // Invokes displayDimensions() method to display values
        System.out.println("\nRectangle1 Details");
        System.out.println("===================");
        objRec1.displayDimensions();
        System.out.println("\nRectangle2 Details");
        System.out.println("===================");
        objRec2.displayDimensions();
    }
}