package com.najmaldeen.session10;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class YearMonth2 {
    public static void main(String[] args) {
        System.out.println("The Present Year Month:"+ YearMonth2.now());
        System.out.println("Month alone:"+ YearMonth2.parse("2023-02").getMonthValue());
        System.out.println("Year alone:"+ YearMonth2.parse("2023-02").getYear());
        System.out.println("This year is a Leap year:" + YearMonth2.parse("2023-02").isLeapYear());


        // Code Snippet 25
        ZonedDateTime zoDaTi = ZonedDateTime.now();

        // Code Snippet 26
        int sampleYear = ZonedDateTime.now().getYear();

        // Code Snippet 27
        int sampleMonth = ZonedDateTime.now() .getMonth().getValue();


        // Code Snippet 28
        Period previousDateTime = null;
        Period newZoneDateTime = previousDateTime.plus (Period.ofDays(4));


        // Code Snippet 29
        ZoneId sampleZoneId = ZoneId.of("UTC+1");

        // Code Snippet 30
        ZoneId sampleZoneIdA = ZoneId.of("America/New_York");
        ZoneId sampleZoneIdB = ZoneId.of("Europe/Paris");









    }
}
