package physicsWallah.Queues.Questions;

import java.util.ArrayDeque;
import java.util.Queue;

public class PrintQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        Queue<Integer> temp = new ArrayDeque<>();
        while(!q.isEmpty()){
            temp.add(q.remove());
        }
        while(!temp.isEmpty()){
            System.out.print(temp.peek()+ " ");
            q.add(temp.remove());
        }
    }
}
