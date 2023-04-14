package PracticeFour;

import java.util.*;
import java.util.Map.*;


public class TreeMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> tm = new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));

        tm.put(4,"E");
        tm.put(6,"G");

        System.out.println(tm.get(0));
        System.out.println(tm);



//        System.out.println(e.getKey() + " " + e.getValue());
    }
}
