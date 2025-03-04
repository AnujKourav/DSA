package physicsWallah.Linked_list.DoublyLinkedList;

public class basics {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }
    public static void display(Node temp){
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayrev(Node temp){
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        e.prev = d;
        d.prev = c;
        c.prev = b;
        b.prev = a;
        a.prev = null;

        System.out.println("Forward Linked List: ");
        display(a);
        System.out.println("Backward linked list: ");
        displayrev(e);

    }
}
