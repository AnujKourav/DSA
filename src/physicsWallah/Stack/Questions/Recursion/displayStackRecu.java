package physicsWallah.Stack.Questions.Recursion;
import java.util.Stack;

public class displayStackRecu {
    static void printReverseRec(Stack<Integer> gt){
        if(gt.isEmpty())return;
        int top = gt.pop();
        System.out.print(top +" ");  // used to print in reverse order
        printReverseRec(gt);
        gt.push(top);
    }
    static void printRec(Stack<Integer> gt){
        if(gt.isEmpty())return;
        int x = gt.pop();
        printRec(gt);
        System.out.print(x +" ");
        gt.push(x);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        printReverseRec(st);
        System.out.println();
        System.out.println(st);
        printRec(st);
        System.out.println();
        System.out.println(st);
    }
}
