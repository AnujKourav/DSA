package physicsWallah.Linked_list.DoublyLinkedList;

public class Palindrome {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }
    public static boolean isPalindrome(Node head){
        Node left = head;
        Node right = head;
        while(right.next != null){
            right = right.next;
        }
        while(left != right && left.prev != right){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.prev;
        }
        return true;
    }


    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        e.prev = d;
        d.prev = c;
        c.prev = b;
        b.prev = a;
        System.out.println(Palindrome.isPalindrome(a));
    }
}
