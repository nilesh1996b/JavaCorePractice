package PracticeTwo;

import java.util.ArrayDeque;

public class PracticeDemo {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>(10);

        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);

        dq.pollFirst();


        /*dq.forEach(System.out::println);

        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);*/

//        System.out.println();

        dq.forEach(System.out::println);

    }
}
