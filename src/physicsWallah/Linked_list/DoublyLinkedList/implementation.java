package physicsWallah.Linked_list.DoublyLinkedList;

public class implementation {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }
    Node head;
    Node tail;
    public void insertAtFirst(int val){
        Node a = new Node(val);
        if(head == null){
            head = a;
        }
        else{
            head.prev = a;
            a.next = head;
            head = a;
        }
    }
    public void insertAtLast(int val){
        Node a = new Node(val);
        if(head == null){
            head = a;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = a;
            a.prev = temp;
            tail = a;
        }
    }
    public void insertAt(int idx, int val){
        if(idx == 1){
            insertAtFirst(val);
            return;
        }
        if(idx == size()){
            insertAtLast(val);
            return;
        }
        Node temp = head;
        int i = 1;
        while(i < idx-1){
            i++;
            temp = temp.next;
        }
        Node a = new Node(val);
        a.next = temp.next;
        a.prev = temp;
        temp.next.prev = a;
        temp.next = a;
    }
    public void deleteFirst(){
        if(head == null)return;
        head = head.next;
        head.prev = null;
    }
    public void deleteLast(){
        if(tail == null)return;
        tail = tail.prev;
        tail.next = null;
    }
    public void deleteIdx(int idx){
        if(idx == 1) {
            deleteFirst();
            return;
        }
        if(idx == size()){
            deleteLast();
            return;
        }
        Node temp = head;
        int i = 1;
        while(i < idx-1){
            i++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void displayRev(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public int size(){
        Node temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
    public static void main(String[] args) {
        implementation obj = new implementation();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.display();
        obj.displayRev();
        obj.insertAtFirst(10);
        obj.insertAtFirst(20);
        obj.display();
        obj.displayRev();
        System.out.println("Size of the LL: " + obj.size());
        obj.insertAt(2,5); // 1 based indexing
        obj.display();
        obj.insertAt(1,70);
        obj.display();
        obj.insertAt(obj.size(), 100);
        obj.display();
        obj.deleteFirst();
        obj.display();
        obj.deleteLast();
        obj.display();
        obj.deleteIdx(7);
        obj.display();
    }
}
