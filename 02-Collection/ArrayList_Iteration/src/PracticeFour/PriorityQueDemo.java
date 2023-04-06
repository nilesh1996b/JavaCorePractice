package PracticeFour;

import java.util.*;
public class PriorityQueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> p = new PriorityQueue<>(new MyCom());

        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);

        System.out.println(p.peek());

        p.forEach(x-> System.out.print(x + " "));
        System.out.println();
        p.poll();
        p.forEach(x-> System.out.print(x + " "));


    }
}

class MyCom implements Comparator<Integer>
{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}
