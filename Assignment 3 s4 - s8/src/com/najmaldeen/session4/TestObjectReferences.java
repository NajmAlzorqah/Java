package com.najmaldeen.session4;

public class TestObjectReferences {

    public static void main(String[] args) {
 /* Instantiates an object of type Rectangle and stores its reference in the
object reference variable, objRec1
 */
        Rectangle2 objRec1 = new Rectangle2(10, 20);
        // Declares a reference variable of type Rectangle
        Rectangle2 objRec2;
        // Assigns the value of objRec1 to objRec2
        objRec2 = objRec1;
        System.out.println("\nRectangle1 Details");
        System.out.println("===================");
 /* Invokes the method that displays values of the instance variables for
object, objRec1
 */
        objRec1.displayDimensions();
        System.out.println("\nRectangle2 Details");
        System.out.println("===================");
        objRec2.displayDimensions();
    }
}
