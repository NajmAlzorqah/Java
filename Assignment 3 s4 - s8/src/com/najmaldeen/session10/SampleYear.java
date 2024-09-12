package com.najmaldeen.session10;

import java.time.Year;

public class SampleYear {
    public static void main(String[] args) {
        System.out.println(" The Present Year():"+Year.now());
        System.out.println("The year 2022 is a Leap year :"+ Year.isLeap(2022));
        System.out.println("The year 2024 is a Leap year :"+ Year.isLeap(2024));

    }
}
