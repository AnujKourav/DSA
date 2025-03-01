package physicsWallah.Linked_list.Questions;

public class palindromeM1 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    public static boolean isPalindrome(Node head){
        if (head == null || head.next == null) return true;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node rev = reverse(slow);
        Node temp = head;
        Node a = rev;
        while (a != null) {
            if (temp.data != a.data) {
                return false;
            }
            temp = temp.next;
            a = a.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);
        Node f = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(isPalindrome(a));
    }
}
