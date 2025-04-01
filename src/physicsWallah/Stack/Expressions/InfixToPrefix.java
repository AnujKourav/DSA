package physicsWallah.Stack.Expressions;

import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";  // -> -/*+5349
        Stack<String>val = new Stack<>();
        Stack<Character>op = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ch >= 48 && ch <= 57){
                val.push(str.substring(i,i+1));
            }
            else if(op.isEmpty() || op.peek() == '(' || ch == '(')op.push(ch);
            else if(ch == ')'){
                while(op.peek() != '('){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char op1 = op.pop();
                    val.push(op1+v1+v2);
                }
                op.pop();
            }
            else{
                if(ch == '-' || ch == '+'){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char op1 = op.pop();
                    val.push(op1+v1+v2);
                    op.push(ch);
                }
                else if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char op1 = op.pop();
                        val.push(op1+v1+v2);
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while(!op.isEmpty()){
            String v2 = val.pop();
            String v1 = val.pop();
            char op1 = op.pop();
            val.push(op1+v1+v2);
        }
        System.out.println(val.peek());
    }
}
