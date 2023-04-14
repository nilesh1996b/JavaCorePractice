package PracticeFive;
import java.util.*;
public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>(new MyComm());
        p.offer(10);
        p.offer(5);
        p.offer(20);
        p.offer(25);
        p.offer(3);

        p.poll();

        System.out.println(p);
    }

}

class MyComm implements Comparator<Integer>
{


    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}
