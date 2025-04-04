package physicsWallah.Queues;

public class CircularQueueLinkedList {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    Node head;
    Node tail;
    int size = 0;
    void add(int val){
        Node a = new Node(val);
        if(head == null){
            head = a;
            head.next = head;
            tail = head;
        }
        else{
            tail.next = a;
            tail = a;
            tail.next = head;
        }
        size++;
    }
    int peek() throws Exception{
        if(head == null) throw new Exception("Queue is Empty");
        return head.val;
    }
    int remove() throws Exception{
        if(head == null) throw new Exception("Queue is Empty");
        int x = head.val;
        if(head == head.next) head = tail = null;
        else{
            head = head.next;
            tail.next = head;
        }
        size--;
        return x;
    }
    boolean isEmpty(){
        if(head == null)return true;
        return false;
    }
    void display(){
        if(head == null){
            System.out.println("Queue is Empty");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.val + " ");
            temp = temp.next;
        }while(temp!=head);
        System.out.println();
    }
    public static void main(String[] args) throws Exception{
        CircularQueueLinkedList q1 = new CircularQueueLinkedList();
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
        System.out.println(q1.remove());
        q1.display();
        System.out.println(q1.peek());
        q1.display();
        q1.remove();
        q1.display();
        q1.add(6);
        q1.add(7);
        q1.add(7);
        q1.add(8);
        q1.add(8);
        q1.display();
        q1.remove();
        q1.add(9);
        q1.display();
    }
}
