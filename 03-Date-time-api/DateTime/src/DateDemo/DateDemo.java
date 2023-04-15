package DateDemo;
import java.util.*;

public class DateDemo {
    public static void main(String[] args) {

//        Date d = new Date(System.currentTimeMillis());
//        Date d = new Date("1/1/1980");
        Date d = new Date("7/26/2020");

//        System.out.println(d.getTime());
//        System.out.println(d.getDate());
//        System.out.println(d.getDay());
        System.out.println(d.getMonth()+1);

//        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
//        System.out.println(Long.MAX_VALUE);
    }
}
