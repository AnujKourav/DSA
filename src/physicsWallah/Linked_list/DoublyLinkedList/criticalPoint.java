package physicsWallah.Linked_list.DoublyLinkedList;

public class criticalPoint {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int val){
            data = val;
        }
    }
    public static void critical(Node head){
        if (head == null || head.next == null || head.next.next == null) {
            System.out.println("-1 -1");
            return;
        }
        int small = Integer.MAX_VALUE;
        Node temp = head.next;
        Node c1 = null;
        Node c2 = null;
        int length = 0;
        Node start = null;
        Node end = null;
        while(temp.next != null){
            if(temp.data < temp.prev.data && temp.data < temp.next.data){
                if(c1 != null){
                    c2 = temp;
                    small = Math.min(small,length);
                    c1 = c2;
                    end = c2;
                    c2 = null;
                    length = 0;
                }
                else {
                    c1 = temp;
                    start = c1;
                }
            }
            else if(temp.data > temp.prev.data && temp.data > temp.next.data){
                if(c1 != null){
                    c2 = temp;
                    small = Math.min(small,length);
                    c1 = c2;
                    end = c2;
                    c2 = null;
                    length = 0;
                }
                else {
                    c1 = temp;
                    start = c1;
                }
            }
            temp = temp.next;
            length++;
        }
        int large = 0;
        while(start != end){
            start = start.next;
            large++;
        }
        System.out.println(small + " " + large);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(5);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(7);
        Node g = new Node(8);
        Node h = new Node(9);
        Node i = new Node(1);
        Node j = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;

        j.prev = i;
        i.prev = h;
        h.prev = g;
        g.prev = f;
        f.prev = e;
        e.prev = d;
        d.prev = c;
        c.prev = b;
        b.prev = a;

        critical(a);
    }
}
