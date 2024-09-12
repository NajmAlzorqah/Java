package com.najmaldeen.session10;
import java.time.Instant;
import java.time.OffsetTime;
import java.time.ZoneId;


public class InstCl {
    public static void main(String[] args) {
        OffsetTime d = OffsetTime.ofInstant (Instant.now(),ZoneId.
                systemDefault());
        System.out.println(d);
    }
}
