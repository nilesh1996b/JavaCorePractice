package PracticeOne;

import java.util.*;

public class Practice {
    public static void main(String[] args) {

        LinkedList<Integer> al1 = new LinkedList<>();
        ArrayList<Integer> al2 = new ArrayList<>(List.of(20,30,40,50,60,70,80,90));
        ArrayList<Integer> al3 = new ArrayList<>(List.of(100,110,120,130,140,150,160,170));

        al1.add(10);
        al1.add(0,5);
        al1.addAll(al2);
        al1.addAll(0,al3);
        System.out.println(al1);
        al1.addAll(al1.subList(5,al1.size()));
        System.out.println(al1);
        al1.set(0,22);
        System.out.println(al1);
        al2.retainAll(al2.subList(5,al2.size()));
        boolean result = !al2.isEmpty();
        System.out.println(result);
        boolean r2 = !al2.contains(20);
        System.out.println(r2);
        boolean r3 = !al1.containsAll(al2);
        System.out.println(r3);
//        al3.clear();
        al1.removeAll(al3);
        System.out.println(al1);

        al1.forEach(System.out::println);

        for(var x:al1)
        {
            System.out.println(x + " working");
        }

        ListIterator<Integer> it = al1.listIterator();

        while(it.hasPrevious())
        {
            System.out.println(it.previous());
        }

        al1.addFirst(200);
        al1.addLast(500);

        System.out.println(al1);
        System.out.println(al1.peek());
        System.out.println(al1.peekFirst());
        System.out.println(al1.peekLast());


    }
}
