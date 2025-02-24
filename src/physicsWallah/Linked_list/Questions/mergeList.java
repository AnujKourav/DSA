package physicsWallah.Linked_list.Questions;

public class mergeList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node merge(Node h1, Node h2){
        Node h = new Node(100);
        Node t = h;
        Node t1 = h1;
        Node t2 = h2;
        while(t1 != null && t2 != null){
            if(t1.data <= t2.data){
                t.next = t1;
                t = t1;
                t1 = t1.next;
            }
            else{
                t.next = t2;
                t = t2;
                t2 = t2.next;
            }
        }
        if(t1 != null){
            t.next = t1;
        }
        else if(t2 != null){
            t.next = t2;
        }
        return h.next;
    }
    public static void display(Node a){
        Node temp = a;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(8);
        Node e = new Node(9);
        Node f = new Node(10);
        Node g = new Node(11);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        Node p = new Node(2);
        Node q = new Node(4);
        Node r = new Node(6);
        Node s = new Node(7);
        p.next = q;
        q.next = r;
        r.next = s;

        System.out.println("List 1 is :");
        display(a);
        System.out.println("List 2 is :");
        display(p);
        Node ans = merge(a,p);
        System.out.println("Merged list is :");
        display(ans);
    }
}
