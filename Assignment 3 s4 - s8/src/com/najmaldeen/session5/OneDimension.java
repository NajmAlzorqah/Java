package com.najmaldeen.session5;

public class OneDimension {
    //Declare a single-dimensional array named marks
    int marks[]; // line 1
    /**
     * Instantiates and initializes a single-dimensional array
     *
     * @return void
     */
    public void storeMarks() {
// Instantiate the array
        marks = new int[4]; // line 2
        System.out.println("Storing Marks. Please wait...");
// Initialize array elements
        marks[0] = 65; // line 3
        marks[1] = 47;
        marks[2] = 75;
        marks[3] = 50;
    }
    /**
     * Displays marks from a single-dimensional array
     *
     * @return void
     */
    public void displayMarks() {
        System.out.println("Marks are:");
// Display the marks
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Instantiate class OneDimension
        OneDimension oneDimenObj = new OneDimension(); //line 4
//Invoke the storeMarks() method
        oneDimenObj.storeMarks(); // line 5
//Invoke the displayMarks() method
        oneDimenObj.displayMarks(); // line 6
    }
}
