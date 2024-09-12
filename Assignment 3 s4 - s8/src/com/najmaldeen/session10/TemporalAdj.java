package com.najmaldeen.session10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdj {
    public static void main(String[] args) {
        TemporalAdj TemporalAdj = new TemporalAdj();
        TemporalAdj.sampleAdj();
    }

    public void sampleAdj(){

        LocalDate sampledateA = LocalDate.now();
        System.out.println("Current date: " + sampledateA);

        LocalDate nextWednesday = sampledateA.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println("Next Wednesday on : " + nextWednesday);
        LocalDate firstInYear = LocalDate.of(sampledateA.getYear(),sampledateA.getMonth(), 1);
        LocalDate secondSunday = firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)).with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println("Second Sunday of the month on : " + secondSunday);
    }
}
