package physicsWallah.Linked_list.Questions;

import javax.xml.transform.Source;

public class SplitLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node a){
        Node temp  = a;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void split(Node a){
        Node t = a;
        Node h1 = new Node(100);
        Node even = h1;
        Node h2 = new Node(101);
        Node odd = h2;
        while (t != null){
            if(t.data % 2 == 0){
                even.next = t;
                even = even.next;
            }
            else{
                odd.next = t;
                odd = odd.next;
            }
            t = t.next;
        }
        even.next = null;
        odd.next = null;

        System.out.println("Even List :");
        display(h1.next);
        System.out.println("Odd List :");
        display(h2.next);
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        Node j = new Node(17);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;

        System.out.println("Initial list is :");
        display(a);
        split(a);
    }
}
