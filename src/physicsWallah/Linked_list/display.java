package physicsWallah.Linked_list;

public class display {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
        public static void printList(Node head){ //display using function
            Node temp = head; //for preserving the head
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        public static void displayr(Node head){ //display using recursion
            if(head == null)return; //base case
            System.out.print(head.data+" ");
            displayr(head.next);
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

        //display using for loop
        Node temp = a;
        for(int i=1;i<=5;i++){ // number of element is known
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        //display using while loop
        System.out.println();
        temp = a;
        while(temp != null){ //size is not given
            System.out.print(temp.data +" ");
            temp = temp.next;
        }

        //display using function
        System.out.println();
        Node.printList(a);

        //display using recursion
        System.out.println();
        Node.displayr(a);
    }
}
