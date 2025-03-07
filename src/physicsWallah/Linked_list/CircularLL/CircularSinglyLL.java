package physicsWallah.Linked_list.CircularLL;

public class CircularSinglyLL {

    //tail is connected to head
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    Node head;
    public void insertAtFirst(int val){
        Node a = new Node(val);
        if(head == null){
            head = a;
            head.next = head;
        }
        else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = a;
            a.next = head;
            head = a;
        }
    }
    public void insertAtLast(int val) {
        Node a = new Node(val);
        if (head == null) {
            head = a;
            head.next = head;
        }
        else{
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = a;
            a.next = head;
        }
    }
    public void deleteHead(){
        if(head == null)return;
        if(head.next == head){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
    }
    public void deleteTail(){
        if(head == null)return;
        if(head.next == head){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != head){
            temp = temp.next;
        }
        temp.next = head;
    }
    public void display(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while(temp != head);
        System.out.println();
    }
    public static void main(String[] args) {
        CircularSinglyLL s = new CircularSinglyLL();
        s.insertAtFirst(1);
        s.insertAtFirst(2);
        s.insertAtFirst(3);
        s.insertAtFirst(4);
        s.display();
        s.insertAtLast(5);
        s.insertAtLast(6);
        s.display();
        s.deleteHead();
        s.display();
        s.deleteTail();
        s.display();
    }
}
