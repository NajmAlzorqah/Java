package com.najmaldeen.session10;
import java.time.*;
public class ClockDemo {
    private Clock clock;
    public static void main(String[] args) {
        // Code Snippet 1
        Clock defaultClock = Clock.systemUTC();
        System.out.println("Clock : " + defaultClock);

        Clock defaultClock2 = Clock.systemDefaultZone();
        System.out.println("Clock : " + defaultClock2);

        // Code Snippet 2
        defaultClock = Clock.systemUTC();
        System.out.println("Clock : " + defaultClock);


        defaultClock2 = Clock.systemDefaultZone();
        System.out.println("Clock : " + defaultClock2);
        ClockDemo objClockDemo = new ClockDemo();
        LocalDate eventDate = LocalDate.of(2021, 02,14);
        Clock clock = Clock.systemUTC();
        if (eventDate.isBefore(LocalDate.now(clock))) {
            System.out.println("yes");
        }

        // Code Snippet 4
        Instant sampleNow = Instant.now();

        // Code Snippet 5
        Instant sampleFuture = sampleNow.plusNanos(4);
        // four nanoseconds in the future
        Instant samplePast = sampleNow.minusNanos(4);
        //four nanoseconds in the past


        // Code Snippet 6
        LocalDate sampleLocDaA = LocalDate.now();

        // Code Snippet 7
        LocalDate sampleLocDaB = LocalDate.of(2016, 07, 04);

        // Code Snippet 8
        LocalDate localDate = null;
        int year = localDate.getYear();
        int dayOfMonth = localDate.getDayOfMonth();
        Month month = localDate.getMonth();
        int dayOfYear = localDate.getDayOfYear();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        int monthvalue = month.getValue();

        // Code Snippet 9
        LocalDate sampleLocDaA2 = LocalDate.now();
        LocalDate sampleLocDa = LocalDate.of(2016, 04, 30);
        LocalDate sampleLocDaA3 = sampleLocDa.plusYears(4);
        LocalDate sampleLocDaB2 = sampleLocDa.minusYears(4);


        // Code Snippet 10
        LocalDateTime sampleLocDaTiA = LocalDateTime.now();

        // Code Snippet 11
        LocalDateTime sampleLocDaTiB = LocalDateTime.of(2016, 05, 07, 12, 06, 16, 054);

        // Code Snippet 12
        LocalDateTime sampleLocDaTi = LocalDateTime.now();
        LocalDateTime sampleLocDaTiA2 = sampleLocDaTi.plusYears(4);
        LocalDateTime sampleLocDaTiB3 = sampleLocDaTi.minusYears(4);

        // Code Snippet 13
        LocalTime sampleLocTiA = LocalTime.now();

        // Code Snippet 14
        LocalTime sampleLocTiB = LocalTime.of(12, 24, 33, 00135);


        // Code Snippet 15
        LocalTime sampleLocTi = LocalTime.of(12, 24, 33, 00135);
        // current local time
        LocalTime sampleLocTiFuture = sampleLocTi.plusHours(4);// future
        LocalTime sampleLocTiPast = sampleLocTi.minusHours(4);// past

        // Code Snippet 15







    }
}
