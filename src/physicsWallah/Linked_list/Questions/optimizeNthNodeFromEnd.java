package physicsWallah.Linked_list.Questions;

public class optimizeNthNodeFromEnd {
    public static Node optimizedNodeFromLast(Node head,int idx){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=idx;i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
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

        Node ans = optimizedNodeFromLast(a, 2);
        System.out.println(ans.data);
    }
}
