package physicsWallah.Linked_list.Questions;

import physicsWallah.Linked_list.basics;

public class delete_node {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
        static void deleteNode(Node any){
            if(any.next == null)return; //we do not have information of previous list
            any.data = any.next.data;
            any.next = any.next.next;
        }
        public static void printList(Node head){ //display using function
            Node temp = head; //for preserving the head
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        a.next = b; // 5 -> 3  9  8  16
        b.next = c; // 5 -> 3 -> 9  8  16
        c.next = d; // 5 -> 3 -> 9 -> 8  16
        d.next = e; // 5 -> 3 -> 9 -> 8 -> 16

        Node.printList(a);
        Node.deleteNode(e);
        Node.printList(a);

    }
}
