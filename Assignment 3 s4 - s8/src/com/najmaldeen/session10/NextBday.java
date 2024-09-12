package com.najmaldeen.session10;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class NextBday {
    public static void main(String[] args) {
        LocalDate presentday = LocalDate.now();
        LocalDate bday = LocalDate.of(1983, Month.MAY, 22);
        LocalDate comingBDay = bday.withYear(presentday.getYear());

        if (comingBDay.isBefore(presentday) || comingBDay.isEqual(presentday))
        {
            comingBDay = comingBDay.plusYears(1);
        }
        Period waitA = Period.between(presentday, comingBDay);
        long waitB = ChronoUnit.DAYS.between(presentday, comingBDay);
        System.out.println("Totally, I must wait for " + waitA.getMonths() + " months,and " + waitA.getDays() + " days to celebrate my next B'day. (" +waitB + " days in total)");
    }
}

