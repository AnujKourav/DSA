package physicsWallah.Stack.Questions;

import java.util.Stack;

public class Insertion {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        int idx = 2;
        int element = 7;
        Stack<Integer> gt = new Stack<>();
        while(st.size() > idx){
            gt.push(st.pop());
        }
        st.push(element);
        while(!gt.isEmpty()){
            st.push(gt.pop());
        }
        System.out.println(st);
    }
}
