package PracticeFive;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>(List.of(15,20,25,30,35,40,45,50));
        ArrayList<Integer> al4 = new ArrayList<>(List.of(15,20,25,30,35,40,45,50));
        ArrayList<Integer> al3 = new ArrayList<>(List.of(1,2,3,4,5,6));
        al1.add(10);
        al1.add(0,5);
        al1.addAll(al2);
        al1.addAll(0,al3.subList(0,4));
        System.out.println(al1.contains(5));
        System.out.println(al1.containsAll(al2));
//        al1.clear();
        System.out.println(al1);
        System.out.println(al1.isEmpty());
        System.out.println(al2.equals(al4));

        for(var x:al1)
        {
            System.out.println(x);
        }





    }
}
