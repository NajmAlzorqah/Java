package com.najmaldeen.session10;

import java.time.LocalDate;
import java.time.Period;
import java.time.Month;
import java.util.stream.Stream;

public class DatesUntilMethodDemo {
    public static void main(String[] args) {

        Stream<LocalDate> dates = LocalDate.now().datesUntil(LocalDate.parse("2023-11-30"));
        dates.forEach(System.out::println);
    }
}
