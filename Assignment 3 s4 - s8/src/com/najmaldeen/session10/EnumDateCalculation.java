package com.najmaldeen.session10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EnumDateCalculation {
    public static void main(String[] args) {
        EnumDateCalculation javaenum = new EnumDateCalculation ();
        javaenum.enumChromoUnits();
    }
    public void enumChromoUnits(){
// To display the current date
        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);
// To display the result 2 weeks addition to the current date
        LocalDate nextWeek = today.plus(2, ChronoUnit.WEEKS);
        System.out.println("After 2 weeks: " + nextWeek);
// To display the result 2 months addition to the current date
        LocalDate nextMonth = today.plus(2, ChronoUnit.MONTHS);
        System.out.println("After 2 months: " + nextMonth);
// To display the result 2 years addition to the current date
        LocalDate nextYear = today.plus(2, ChronoUnit.YEARS);
        System.out.println("After 2 years: " + nextYear);
// To display the result 20 years addition to the current date
        LocalDate nextDecade = today.plus(2, ChronoUnit.DECADES);
        System.out.println("Date after twenty years: " + nextDecade);
    }
}
