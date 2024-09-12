package com.najmaldeen.session10;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class CustomTempAdjSample implements TemporalAdjuster {
    public Temporal adjustInto(Temporal temporalInput) {
        LocalDate loDate = LocalDate.from(temporalInput);
        int day = loDate.getDayOfMonth();//Present day
        if (day % 2 == 0) {// to find out odd days
            loDate = loDate.plusDays(1);
        } else {
            loDate = loDate.plusDays(2);
        }
        return temporalInput.with(loDate);
    }
    public static void main(String args[]){
        LocalDate randomDateA = LocalDate.of(2023, Month.MAY, 5);
        LocalDate randomDateB = LocalDate.of(2023, Month.MAY, 7);
        CustomTempAdjSample nextOddDay = new CustomTempAdjSample();
        LocalDate upcomOddDayA = randomDateA.with(nextOddDay);
        LocalDate upcomOddDayB = randomDateB.with(nextOddDay);
        System.out.println("Upcoming Odd Day for " + randomDateA + " is " + upcomOddDayA);// to display the upcoming odd day
        System.out.println("Upcoming Odd Day for " + randomDateB + " is " + upcomOddDayB);
    }// final result

}
