package physicsWallah.Stack.Expressions;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii <= 57 && ascii >= 48)st.push(ch+"");
            else{
                String v2 = st.pop();
                String v1 = st.pop();
                st.push("("+v1+ch+v2+")");
            }
        }
        System.out.println(st.peek());
    }
}
