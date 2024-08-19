package com.najmaldeen.session8;

public class Employee implements Person {
    public void printInterface(){
        display1("Hello there");
        display2("Hi there");
    }
    public static void main(String[] args){
        Employee objEmployee = new Employee();
        objEmployee.printInterface();
    }
}
