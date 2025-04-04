package physicsWallah.Queues;

public class DequeImplementationLinkedList {
    static class Node{
        Node next;
        Node prev;
        int data;
        Node(int data){
            this.data = data;
        }
    }
    Node head;
    Node tail;
    int size = 0;
    void add(int data){
        Node a = new Node(data);
        if(head == null){
            head = a;
            tail = a;
        }
        else{
            tail.next = a;
            a.prev = tail;
            tail = a;
        }
        size++;
    }
    void addFirst(int data){
        Node a = new Node(data);
        if(head == null){
            head = tail = a;
        }
        else{
            a.next = head;
            head.prev = a;
            head = a;
        }
        size++;
    }
    void addLast(int data){
        Node a = new Node(data);
        if(head == null){
            head = tail = a;
        }
        else{
            tail.next = a;
            a.prev = tail;
            tail = a;
        }
        size++;
    }
    int peek() throws Exception{
        if(head == null) throw new Exception("Deque is Empty");
        return head.data;
    }
    int remove() throws Exception{
        if(head == null)throw new Exception("Deque is Empty");
        int x = head.data;
        if(head == tail){
            head = tail = null;
        }
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
        return x;
    }
    int removeFirst() throws Exception{
        if(head == null) throw new Exception("Deque is empty");
        int x = head.data;
        if(head == tail){
            head = tail = null;
        }
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
        return x;
    }
    int removeLast() throws Exception{
        if(head == null) throw new Exception("Deque is empty");
        int x = tail.data;
        if(head == tail){
            head = tail = null;
        }
        else{
            tail = tail.prev;
            tail.next = null;
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
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void displayRev(){
        if(head == null){
            System.out.println("Queue is Empty");
            return;
        }
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception{
        DequeImplementationLinkedList q = new DequeImplementationLinkedList();
        System.out.println(q.size);
        System.out.println(q.isEmpty());
        q.add(1);
        q.addFirst(2);
        q.addLast(3);
        q.display();
        q.displayRev();
        System.out.println(q.isEmpty());
        q.add(5);
        q.add(5);
        q.add(5);
        q.add(5);
        q.display();
        System.out.println(q.peek());
        System.out.println(q.remove());
        q.display();
        System.out.println(q.removeFirst());
        q.display();
        System.out.println(q.removeLast());
        q.display();
    }
}
