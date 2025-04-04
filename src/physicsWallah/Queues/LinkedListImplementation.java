package physicsWallah.Queues;

public class LinkedListImplementation {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    Node head = null;
    Node tail = null;
    int size = 0;
    void add(int data){
        Node a = new Node(data);
        if(head == null){
            head = tail = a;
        }
        else{
            tail.next = a;
            tail = a;
        }
        size++;
    }
    int peek(){
        if(head == null){
            System.out.println("Queue is Empty");
            return -1;
        }
        return head.data;
    }
    int poll(){
        if (head == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int x = head.data;
        head = head.next;
        if(head == null) tail = null;
        size = Math.max(0, size - 1);
        return x;
    }
    boolean isEmpty(){
        if(head == null)return true;
        return false;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedListImplementation q1 = new LinkedListImplementation();
        System.out.println(q1.isEmpty());
        System.out.println(q1.size);
        q1.add(1);
        q1.display();
        q1.add(2);
        q1.display();
        q1.add(3);
        q1.display();
        q1.add(4);
        q1.display();
        q1.add(5);
        q1.display();
        System.out.println(q1.isEmpty());
        System.out.println(q1.poll());
        q1.display();
        System.out.println(q1.peek());
        q1.display();
        q1.poll();
        q1.display();
    }
}
