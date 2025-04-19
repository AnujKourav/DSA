package physicsWallah.CollectionInterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeInterfaceExamples {
    static void DequeExamples(){
        Deque<Integer> dq = new ArrayDeque<>(); // -> deque can be implemented using array
        Deque<Integer> dw = new LinkedList<>(); // -> or LinkedList
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq); // 2 1 3 4
        System.out.println(dq.pollFirst()); // 2
        System.out.println(dq.pollLast()); // 4
        System.out.println(dq);
    }
    public static void main(String[] args) {
        DequeExamples();
    }
}
