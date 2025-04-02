package physicsWallah.Queues;

// queue works on the principle first in first out
// two ends in queue
// 1.Rear to push or add element in the queue
// 2.Front to pop or remove any element from the queue

// __________________________________________________
// |    |    |    |    |    |    |    |    |    |    |
//----------------------------------------------------
// front                                            rear

// Types of Queue
// 1. Simple Queue
// 2. DEQue(doubly ended queue)
// 3. Circular Queue

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;

public class basics {
    public static void main(String[] args) {
        // Queue<Integer> q = new Queue<Integer>(); // -> Queue is abstract cannot be instantiated
        // Instead we can use array queue or linked list queue
        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new LinkedList<>();

        // operations that we can perform on queue
        q1.add(1);  // -> similar to push to add element in the queue
        q1.add(2);
        q1.add(3);
        q1.add(4);
        System.out.println(q1);

        q1.remove(); // -> similar to pop to remove element from the queue
        q1.poll();   // -> similar to pop to remove element from the queue

        System.out.println(q1.peek()); // -> similar to peek to see what is in the front in queue
        System.out.println(q1.element()); // -> similar to peek to see what is in the front in queue

        System.out.println(q1.size()); // -> to get the size of the queue

        System.out.println(q1.isEmpty()); // -> return true or false
    }
}

