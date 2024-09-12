package com.najmaldeen.session10;

import java.time.*;


public class DateDemo {
    public static void main(String[] args) {
        // Code Snippet 16

        LocalDate today = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(1988, 02, 13);

        MonthDay bday = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.
                getDayOfMonth());

        MonthDay currentMonthDay = MonthDay.from(today);
        if(currentMonthDay.equals(bday)){
            System.out.println("**Colorful Joyful Birthday Buddy**");
        }
        else{
            System.out.println("Nope, today is not your B'day");
        }

        // Code Snippet 17
        LocalDateTime datetime = LocalDateTime.of(2016, Month.FEBRUARY, 15, 18, 20);
        ZoneOffset sampleoffset = ZoneOffset.of("-07:00");
        OffsetDateTime date = OffsetDateTime.of(datetime, sampleoffset);
        System.out.println("Sample display of Date and Time using time-zone offset : " + date);

        // Code Snippet 18





























    }
}
