package com.najmaldeen;

public class Emp {
    private int baseSalary;
    private int hourlyRate;
    private static int empNumber;

    public static int empNumber () {
        return empNumber++;
    }

    public Emp ( int baseSalary){
        this(baseSalary,0);
    }

    public Emp(int baseSalary , int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        empNumber();
    }

    public int calculateWage (int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary < 0 )
            throw new IllegalArgumentException("base salary can not be less than 0");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate can not be less than 0");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }


}
