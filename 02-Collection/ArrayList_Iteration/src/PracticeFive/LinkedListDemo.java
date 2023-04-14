package PracticeFive;

import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> al1 = new LinkedList<>();
        LinkedList<Integer> al2 = new LinkedList<>();
        LinkedList<Integer> al3 = new LinkedList<>(List.of(8,9,10,11,12));

        al1.add(1);
        al1.add(0,2);
        al1.add(0,3);
        al1.add(0,4);

        al2.add(5);
        al2.add(6);
        al2.add(7);
        al2.add(8);

        al1.addAll(al2);
        al1.addAll(0,al3);

        al1.addFirst(100);
        al1.addLast(100);




        System.out.println(al1);



    }
}
