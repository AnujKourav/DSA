package physicsWallah.Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeBasics {
    public static void main(String[] args) {
//        Deque<Integer> dq = new Deque<Integer>();
        //deque is an abstract, cannot directly instantiated
        Deque<Integer> dq1 = new ArrayDeque<>();
        Deque<Integer> dq2 = new LinkedList<>();

        //operations
        //add  remove/poll   peek/element
        dq1.addLast(1);
        dq1.addLast(2);
        dq1.addLast(3);
        dq1.addLast(4);
        dq1.addFirst(5);
        dq1.add(6);// add at last
        System.out.println(dq1);
        dq1.remove(); // remove from first
        System.out.println(dq1);
        dq1.removeFirst();
        dq1.removeLast();
        System.out.println(dq1);
        System.out.println(dq1.getFirst());
        System.out.println(dq1.getLast());
        System.out.println(dq1.peek());
    }
}
