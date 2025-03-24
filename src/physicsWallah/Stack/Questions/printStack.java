package physicsWallah.Stack.Questions;

import java.util.Stack;

public class printStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(4);
        Stack<Integer> gt = new Stack<>();
        while(!st.isEmpty()){
            gt.push(st.pop());
        }
        while(!gt.isEmpty()){
            System.out.print(gt.peek() +" ");
            st.push(gt.pop());
        }
    }
}
