package physicsWallah.Queues.Questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseKElement {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        Stack<Integer>st = new Stack<>();
        Queue<Integer>s = new LinkedList<>();
        int k = 3;
        while(k>0){
            st.push(q.poll());
            k--;
        }
        for(int i=q.size()-1;i>=0;i--){
            s.add(q.poll());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        while(!s.isEmpty()){
            q.add(s.remove());
        }
        System.out.println(q);
    }
}
