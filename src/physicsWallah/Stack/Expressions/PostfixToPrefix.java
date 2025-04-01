package physicsWallah.Stack.Expressions;

import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57) st.push(str.substring(i,i+1));
            else{
                String v2 = st.pop();
                String v1 = st.pop();
                st.push(ch+v1+v2);
            }
        }
        System.out.println(st.peek());
    }
}
