package com.najmaldeen.session10;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneDT {
    public static void main(String[] args) {
        System.out.println(ZonedDateTime.now());
        ZonedDateTime sampleZoDT = ZonedDateTime.parse("2023-11- 03T10:15:30+08:00[Asia/Singapore]");
        System.out.println("Present day of the year:"+sampleZoDT.getDayOfYear());
        System.out.println("Present year:"+sampleZoDT.getYear());

        //Code Snippet 32
        ZoneOffset sampleOffset = ZoneOffset.of("+05:00");















    }
}
