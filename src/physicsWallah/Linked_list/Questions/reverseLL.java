package physicsWallah.Linked_list.Questions;

public class reverseLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node iterative(Node head){
        Node prev = null;
        Node curr = head;
        Node agla = null;
        while(curr != null){
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(4);
        Node e = new Node(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        a = iterative(a);
        display(a);
    }
}
