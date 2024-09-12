package com.najmaldeen.session10;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Java8CurTZone {
    public static void main(String[] args) {
        Java8CurTZone java8curtzone = new Java8CurTZone();
        java8curtzone.sampleZDTime();
    }
    public void sampleZDTime() {

        ZonedDateTime dateA = ZonedDateTime.parse("2023-02-16T10:15:30+08:00[Asia/ Singapore]");
        System.out.println("dateA: " + dateA);
        ZoneId sampleidA = ZoneId.of("Asia/Singapore");
        System.out.println("ZoneId: " + sampleidA);
        ZoneId samplecurrentZoneA = ZoneId.systemDefault();
        System.out.println("CurrentZone: " + samplecurrentZoneA);
    }
}
