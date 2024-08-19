package com.najmaldeen.session6;

public class FinalDemo {
    // Declare and initialize a final variable
     float PI = 3.14F; // variable to store value of PI
    /**
     * Displays the value of PI
     *
     * @param pi a float variable storing the value of PI
     * @return void
     */
    public void display(float pi) {
        PI = pi; // generates compilation error
        System.out.println("The value of PI is:"+PI);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Instantiate the FinalDemo class
        final FinalDemo objFinalDemo = new FinalDemo();
// Invoke the display() method
        objFinalDemo.display(22.7F);
    }
}
