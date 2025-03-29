package physicsWallah.Stack.Questions;

import java.util.Stack;

public class BalancedBrackets {
    static boolean isBalanced(String str){
        Stack<Character>st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(')st.push(ch);
            else if(ch == ')'){
                if(st.isEmpty())return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String str = "()(())";
        System.out.println(isBalanced(str));
    }
}
