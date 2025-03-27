package physicsWallah.Stack.Questions.Recursion;

import java.util.Stack;

public class pushAtBottomRecursion {
    static void pushAtBottom(Stack<Integer> gt, int element){
        if(gt.isEmpty()){
            gt.push(element);
            return;
        }
        int top = gt.pop();
        pushAtBottom(gt,element);
        gt.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        pushAtBottom(st,0);
        System.out.println(st);
    }
}
