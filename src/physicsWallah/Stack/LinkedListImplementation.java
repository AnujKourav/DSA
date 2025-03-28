package physicsWallah.Stack;

public class LinkedListImplementation {
    static class Stack{
        class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
            }
        }
        Node top = null;
        void push(int element){
            Node a = new Node(element);
            if(top == null)top = a;
            else {
                a.next = top;
                top = a;
            }
        }
        int peek(){
            if (top == null) {
                System.out.println("Stack underflow exception");
                return -1;
            }
            return top.data;
        }
        int pop(){
            if(top == null){
                System.out.println("Stack underflow exception");
                return -1;
            }
            int val = top.data;
            top = top.next;
            return val;
        }
        int size(){
            int size = 0;
            Node temp = top;
            while(temp != null){
                temp = temp.next;
                size++;
            }
            return size;
        }
        boolean isEmpty(){
            if(top == null)return true;
            else return false;
        }
        void display(){
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty()); // true
        s.push(1);
        s.display(); // 1
        System.out.println(s.isEmpty()); // false
        s.push(2);
        s.display(); // 2 1
        s.push(3);
        s.display(); // 3 2 1
        s.push(4);
        s.display(); // 4 3 2 1
        System.out.println(s.size()); // 4
        System.out.println(s.pop()); // 4
        s.display(); // 3 2 1
        System.out.println(s.peek()); // 3
        s.display(); // 3 2 1
        System.out.println(s.size()); // 3
    }
}
