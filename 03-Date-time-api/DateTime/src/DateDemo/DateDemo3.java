package DateDemo;

import java.util.*;
import java.time.*;
import java.time.temporal.*;


public class DateDemo3 {
    public static void main(String[] args) {

        Date d = new Date();
        d.setHours(21);
        System.out.println(d);

//        new version

//        LocalDate dt = LocalDate.now();
//        LocalDate dt = LocalDate.now(Clock.systemDefaultZone());
//        LocalDate dt = LocalDate.now(ZoneId.of("Asia/Kolkata"));
//        LocalDate dt = LocalDate.of(2020, Month.MARCH,10);
//        LocalDate dt = LocalDate.ofEpochDay(1);
        LocalDate dt = LocalDate.parse("2020-01-03");
        LocalDate d1 = dt.plusMonths(6);
        System.out.println(dt);
        System.out.println(d1);

//        Lets see Local Time

        LocalTime t1 = LocalTime.now();
        System.out.println(t1);
        LocalTime t2 = t1.minusHours(3);
        System.out.println(t2);

    }
}
