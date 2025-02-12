package physicsWallah.Linked_list;

//printing list in reverse order using recursion
public class reverseList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
        static void displayrec(Node head){
            if(head == null)return;
            displayrec(head.next);
            System.out.print(head.data+" ");
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node.displayrec(a);
    }
}
