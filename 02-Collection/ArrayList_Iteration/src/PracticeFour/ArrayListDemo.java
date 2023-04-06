package PracticeFour;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> al1 = new LinkedList<>();
        ArrayList<Integer> al2 = new ArrayList<>(List.of(15,20,25,30,35,40));
        ArrayList<Integer> al3 = new ArrayList<>(List.of(1,2,3,4));

        al1.add(10);
        al1.add(0,5);
        al1.addAll(al2);
        al1.addAll(0,al3);

        al1.addFirst(25);
        al1.addLast(25);


        /*
        al1.remove(al1.size()-1);
        al1.removeAll(al2.subList(1,al2.size()));
//       al1.retainAll(al3);
        System.out.println(al1.equals(al3));
        System.out.println(al1.isEmpty());
        System.out.println(al1.contains(25));
        System.out.println(al1.containsAll(al2));
        */

//        al1.set(0,0);



        System.out.println(al1);

//        ListIterator<Integer> list = al1.listIterator();
//
//        while(list.hasNext())
//        {
//            System.out.println(list.next());
//        }



       for(var x:al1)
       {
           System.out.println(x);
       }

//        System.out.println(al1.get(5));

        System.out.println(al1.lastIndexOf(25));

    }
}
