package physicsWallah.Linked_list.Questions;

public class deepCopy {
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
    public static Node copyList(Node head) {
        Node h = new Node(0);
        Node temp1 = head;
        Node temp2 = h;
        while(temp1 != null){
            Node a = new Node(temp1.data);
            temp2.next = a;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        h = h.next;
        Node n = new Node(0);
        temp1 = head;
        temp2 = h;
        Node temp3 = n;
        while(temp2 != null){
            temp3.next = temp1;
            temp1 = temp1.next;
            temp3 = temp3.next;
            temp3.next = temp2;
            temp2 = temp2.next;
            temp3 = temp3.next;
        }
        temp3 = n;
        temp1 = head;
        temp2 = h;
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        Node ans = copyList(a);
        display(ans);
    }
}
