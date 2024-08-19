package com.najmaldeen.session4;

public class Employee {
    // Declares instance variables
    String employeeName;
    int employeeAge;
    double employeeSalary;
    boolean maritalStatus;

    void displayEmployeeDetails() {
        System.out.println("Employee Details");
        System.out.println("================");
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Age: " + employeeAge);
        System.out.println("Employee Salary: " + employeeSalary);
        System.out.println("Employee MaritalStatus:" + maritalStatus);
    }
}

