package com.najmaldeen;


//Encapsulation & abstraction  ==============

public class Employee {
    private int baseSalary;
    private int hourlyRate;
//    public int extraHours;

    public static int empNum; // Class Filed

    public static void printEmpNum(){ // Class Method
        System.out.println(empNum);
    }

    public Employee(int baseSalary) { //Constructor
        this(baseSalary,0);
    }

    public Employee(int baseSalary, int hourlyRate) { //Constructor Overloading
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        empNum++;
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (getHourlyRate() * extraHours);
    }

    public int calculateWage() { // Method overloading
        return calculateWage(0);
    }


    /**
     * this method accept an Integer for the base salary of an employee
     *
     * @param baseSalary
     */

    //Private is the [Abstraction] for the implementation for the code
    //Hiding the unnecessary details ro reduce complexity
    private void setBaseSalary(int baseSalary) { //Setter [Encapsulation]
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary can not be 0 or less");

        this.baseSalary = baseSalary;
    }

    /**
     * this returns the base salary of an employee
     *
     * @return
     */

    private int getBaseSalary() { // Getter [Encapsulation]
        return baseSalary;
    }


    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("should not be  less than 0");
        this.hourlyRate = hourlyRate;
    }
}
