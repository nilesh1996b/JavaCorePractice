package PracticeFive;
import java.util.*;
import java.util.Map.*;
public class MapDemo {

    public static void main(String[] args) {


        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(1, "A", 2, "B", 3, "C", 4, "D", 5, "E"));

        System.out.println(tm.get(4));
    }

}
