package com.najmaldeen;

public class Main {

    public static void main(String[] args) {
        // Dependency Injection
        // Constructor Injection
        
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport(calculator);
    }
}