package physicsWallah.Stack;

public class ArrayImplementation {
    static class Stack{
        private int []arr = new int[5];
        private int top = 0;
        void push(int element){
            if(top == arr.length){
                System.out.println("Stack overflow exception "+element+" is not added");
                return;
            }
            arr[top] = element;
            top++;
        }
        int peek(){
            if(top == 0){
                System.out.println("Stack underflow exception");
                return -1;
            }
            return arr[top-1];
        }
        int pop(){
            if(top == 0){
                System.out.println("Stack underflow exception");
                return -1;
            }
            top--;
            return arr[top];
        }
        int size(){
            return top;
        }
        boolean isEmpty(){
            if(top == 0)return true;
            else return false;
        }
        boolean isFull(){
            if(top == arr.length)return true;
            else return false;
        }
        int capacity(){
            return arr.length;
        }
        void display() {
            if (top == 0) {
                System.out.println("Stack is Empty");
                return;
            }
            int i = 0;
            while (i < top) System.out.print(arr[i++] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.pop());
        s.push(1);
        s.display();
        s.push(2);
        s.display();
        s.push(3);
        s.display();
        s.push(4);
        s.push(5);
        s.push(6);
        s.display();
        System.out.println("Capacity of stack is: "+s.capacity());
        System.out.println("Stack is empty: "+s.isEmpty());
        System.out.println("Stack is full: "+s.isFull());
        System.out.println("Top element is: "+s.peek());
        System.out.println("Popped element is: "+s.pop());
        System.out.println("Top element is: "+s.peek());
        System.out.println("Size of Stack is: "+s.size());
    }
}
