package physicsWallah.Linked_list.CircularLL;

public class CircularDoublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }
    Node head;
    Node tail;
    public void insertAtHead(int val){
        Node a = new Node(val);
        if(head == null){
            head = a;
            head.next = head;
            head.prev = head;
            tail = head;
        }
        else{
            Node temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = a;
            a.prev = temp;
            a.next = head;
            head.prev = a;
            head = a;
        }
    }
    public void insertAtTail(int val){
        Node a = new Node(val);
        if(head == null){
            head = a;
            a.next = head;
            a.prev = head;
            tail = a;
        }
        else{
            Node temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = a;
            a.prev = temp;
            a.next = head;
            head.prev = a;
            tail = a;
        }
    }
    public void deleteHead(){
        if(head == null)return;
        if(head.next == head){
            head = null;
            tail = null;
            return;
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
        head.prev = temp;
    }
    public void deleteTail(){
        if(head == null)return;
        if(head.next == head){
            head = null;
            tail = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != head){
            temp = temp.next;
        }
        temp.next = head;
        head.prev = temp;
        tail = temp;
    }
    public void display(){
        Node temp = head;
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while(temp != head);
        System.out.println();
    }
    public static void main(String[] args) {
        CircularDoublyLL d = new CircularDoublyLL();
        d.insertAtHead(1);
        d.insertAtHead(2);
        d.insertAtHead(3);
        d.display();
        d.insertAtTail(10);
        d.insertAtTail(20);
        d.display();
        d.deleteHead();
        d.display();
        d.deleteTail();
        d.display();
    }
}
