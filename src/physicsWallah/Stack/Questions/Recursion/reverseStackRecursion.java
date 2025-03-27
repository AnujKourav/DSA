package physicsWallah.Stack.Questions.Recursion;

import java.util.Stack;

public class reverseStackRecursion {
    static void reverseStack(Stack<Integer>st){
        if(st.isEmpty())return;
        int top = st.pop();
        reverseStack(st);
        push(st,top);
    }
    static void push(Stack<Integer>st,int top){
        if(st.isEmpty())st.push(top);
        else {
            int a = st.pop();
            push(st,top);
            st.push(a);
        }
    }
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverseStack(st);
        System.out.println(st);
    }
}
