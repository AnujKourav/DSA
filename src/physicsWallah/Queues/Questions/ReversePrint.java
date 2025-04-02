package physicsWallah.Queues.Questions;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReversePrint {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        Stack<Integer>st = new Stack<>();
        while(!q.isEmpty()){
            st.push(q.poll());
        }
        while (!st.isEmpty()){
            System.out.print(st.peek()+" ");
            q.add(st.pop());
        }
    }
}
