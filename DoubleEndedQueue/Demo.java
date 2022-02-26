package DoubleEndedQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Demo {
    public static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addFirst(10);
        dq.addFirst(20);
        dq.addFirst(30);
        dq.addLast(40);
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());

        System.out.println(dq);

        System.out.println(dq.isEmpty());
        System.out.println(dq.size());
    }
}
