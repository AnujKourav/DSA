package physicsWallah.Stack.Questions;

import java.util.Stack;

public class countUnBalancedBrackets {
    static int countBrackets(String str){
        Stack<Character>st = new Stack<>();
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(') st.push(ch);
            else if(ch == ')'){
                if(st.isEmpty()) count++;
                else if(st.peek() == '(')st.pop();
            }
        }
        return count + st.size();
    }
    public static void main(String[] args) {
        String str = "(((()())";
        System.out.println(countBrackets(str));
    }
}
