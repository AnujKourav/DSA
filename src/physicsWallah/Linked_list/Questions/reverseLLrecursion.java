package physicsWallah.Linked_list.Questions;

public class reverseLLrecursion {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node a){
        Node temp = a;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node reverse(Node a){
        if(a.next == null)return a;
        Node newHead = reverse(a.next);
        a.next.next = a;
        a.next = null;
        return newHead;
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
        a = reverse(a);
        display(a);
    }
}
