package physicsWallah.Stack;
import java.util.Stack;
public class basicsOfStack {
    public static void main(String[] args) {
        // initialization and declaration
        //Syntax:
        //Stack<datatype> nameofStack = new Stack();
        //datatype can be Integer, Character, String, etc..
        Stack<Integer> stack = new Stack<>();

        // push() is used to insert the value in the stack
        stack.push(1);
        stack.push(23);
        stack.push(90);
        stack.push(5);
        stack.push(6);
        stack.push(9);

        // peek() return the top most element in the stack
        System.out.println(stack.peek());

        //to print all the value of the stack
        System.out.println(stack);

        //pop() used to return top element of the stack and removes it from the stack
        System.out.println(stack.pop());
        System.out.println(stack);

        //size() is used to return the size of the stack
        System.out.println("size is: "+ stack.size());

        // isEmpty() return boolean value
        // true if stack is empty, false if stack is not empty
        System.out.println(stack.isEmpty());
    }
}
