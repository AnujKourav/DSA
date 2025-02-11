package physicsWallah.Linked_list;

public class basics {

    public static class Node{ //creating user defined data type
        int data; //data type int that will contain the value that is data
        Node next; //data type node that will contain the address of next node

        Node(int data){ //creating constructor to initialize the value
            this.data = data;
        }
    }

    public static void main(String[] args) {
        //Node x = new Node(); //creating object of node class
        //System.out.println(x.data); //default value of int data -> 0
        //System.out.println(x); //address of x  -> physicsWallah.Linked_list.basics$Node@5f184fc6
        //System.out.println(x.next); // address of next node -> default is null as no next node is created

        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        // 5  3  9  8  16

        System.out.println(a.next); //null as the address field of next is empty
        System.out.println(b.next); //null as the address field of next is empty
        System.out.println(c.next);
        System.out.println(d.next);
        System.out.println(e.next);
        a.next = b; // 5 -> 3  9  8  16
        b.next = c; // 5 -> 3 -> 9  8  16
        c.next = d; // 5 -> 3 -> 9 -> 8  16
        d.next = e; // 5 -> 3 -> 9 -> 8 -> 16
        System.out.println(a.next); //a.next will contain the address of b
        System.out.println("address of b: "+b);
        System.out.println(b.next); //b.next will contain the address of c
        System.out.println("address of c: "+c);
        System.out.println(c.next);
        System.out.println("address of d: "+d);
        System.out.println(d.next);
        System.out.println("address of e: "+e);
        System.out.println(e.next);  //e.next will be empty


        System.out.println(a.data); // 5
        System.out.println(b.data); // 3
        System.out.println(c.data); // 9
        System.out.println(a.next.data); // 3
        System.out.println(a.next.next.data); // 9

    }
}
