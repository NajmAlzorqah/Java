package com.najmaldeen.session6;

public class StaticMembers {
    // Declare and initialize static variable
    public static int staticCounter = 0;
    // Declare and initialize instance variable
    int instanceCounter = 0;
    /**
     * static block
     *
     */
    static{
        System.out.println("I am a static block");
    }
/**
 * Static method
 *
 * @return void
 */
public static void staticMethod(){
    System.out.println("I am a static method");
}
    /**
     * Displays the value of static and instance counters
     *
     * @return void
     */
    public void displayCount(){
//Increment the static and instance variable
        staticCounter++;
        instanceCounter++;
// Print the value of static and instance variable
        System.out.println("Static counter is:"+ staticCounter);
        System.out.println("Instance counter is:"+ instanceCounter);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("I am the main method");
// Invoke the static method using the class name
        StaticMembers.staticMethod();
// Create first instance of the class
        StaticMembers objStatic1 = new StaticMembers();
        objStatic1.displayCount();
// Create second instance of the class
        StaticMembers objStatic2 = new StaticMembers();
        objStatic2.displayCount();
// Create third instance of the class
        StaticMembers objStatic3 = new StaticMembers();
        objStatic3.displayCount();
    }
}
