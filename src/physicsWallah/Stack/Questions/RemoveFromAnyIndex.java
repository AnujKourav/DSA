package physicsWallah.Stack.Questions;

import java.util.Stack;

public class RemoveFromAnyIndex {
    static void removeElementAtIndex(int idx,Stack<Integer>st){
        if (idx < 0 || idx >= st.size()) {
            System.out.println("Invalid index");
            return;
        }
        Stack<Integer>gt = new Stack<>();
        for(int i=st.size()-1;i>idx;i--){
            gt.push(st.pop());
        }
        st.pop();
        while(!gt.isEmpty()){
            st.push(gt.pop());
        }
    }
    static void removeElement(int element, Stack<Integer>st){
        Stack<Integer>gt = new Stack<>();
        while(!st.isEmpty() && st.peek() != element){
            gt.push(st.pop());
        }
        if(!st.isEmpty()) st.pop();
        while(!gt.isEmpty()){
            st.push(gt.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        int idx = 2;
        int element = 4;
        removeElementAtIndex(idx,st);
        System.out.println(st);
        removeElement(element,st);
        System.out.println(st);
    }
}
