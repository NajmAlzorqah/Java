package com.najmaldeen.session10;

import java.time.LocalDate;
import java.time.Period;

public class JavaPeriodSample {
    public static void main(String[] args) {
        LocalDate h1 = LocalDate.now();
// To display the time period results
        System.out.println("Time Period between current date and Maximum no. of days:"+Period.between(h1, LocalDate.MAX).getDays());
        System.out.println("Time Period in Days:" + Period.ofDays(7).getDays());
    }
}
