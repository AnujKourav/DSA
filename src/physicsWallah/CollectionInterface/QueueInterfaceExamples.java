package physicsWallah.CollectionInterface;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueInterfaceExamples {
    static void QueueExamples(){
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q);
    }
    static void MinPriorityQueueExamples(){
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // => default PQ: Min PQ
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq);
        System.out.println(pq.peek()); // small element has the highest priority
        System.out.println(pq.poll()); // 5
        System.out.println(pq);
        System.out.println(pq.peek()); // 7
    }
    static void MaxPriorityQueueExamples(){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // max PQ
        // custom comparator is passed to make PQ Max
        pq.add(10);
        pq.add(5);
        pq.add(12);
        pq.add(7);
        System.out.println(pq);
        System.out.println(pq.peek()); // Greater element has the highest priority
        System.out.println(pq.poll()); // 12
        System.out.println(pq);
        System.out.println(pq.peek()); // 10
    }
    public static void main(String[] args) {
//        QueueExamples();
//        MinPriorityQueueExamples();
        MaxPriorityQueueExamples();
    }
}
