package com.najmaldeen.session10;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class BWCompatibility {
    public static void main(String[] args) {
        BWCompatibility bwcompatibility = new BWCompatibility();
        bwcompatibility.sampleBW();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = format.format( new Date() );
        //Date samplDate = format.parse("2011-03-25");

        // Code Snippet 38
        Calendar cal = new GregorianCalendar();
        TimeZone tiZo = cal.getTimeZone();

        // Code Snippet 39
        cal.setTimeZone(tiZo);

        // Code Snippet 40
        TimeZone tiZo1 = TimeZone.getDefault();
        //OR
        TimeZone tiZo2 = TimeZone.getTimeZone("Europe/Paris");

        // Code Snippet 41
        TimeZone timeZone = null;
        timeZone.getDisplayName();
        timeZone.getID();
        timeZone.getOffset( System.currentTimeMillis());





    }
    public void sampleBW(){
        Date sampleCurDay = new Date();
        System.out.println(" Desired Current date= " + sampleCurDay);
        Instant samplenow = sampleCurDay.toInstant();
        ZoneId samplecurZone = ZoneId.systemDefault();

        LocalDateTime sampleLoDaTi = LocalDateTime.ofInstant(samplenow,
                samplecurZone);
        System.out.println(" Desired Current Local date= " + sampleLoDaTi);

        ZonedDateTime sampleZoDaTi = ZonedDateTime.ofInstant(samplenow,
                samplecurZone);
        System.out.println(" Desired Current Zoned date= " + sampleZoDaTi);
    }
}
