package physicsWallah.Linked_list.Questions;

public class findIntersection {
    public static Node getIntersectionNode(Node headA, Node headB) {
        Node temp1 = headA;
        Node temp2 = headB;
        int size1 = 0;
        while (temp1 != null) {
            temp1 = temp1.next;
            size1++;
        }
        temp1 = headA;
        int size2 = 0;
        while (temp2 != null) {
            temp2 = temp2.next;
            size2++;
        }
        temp2 = headB;
        if (size1 > size2) {
            int n = size1 - size2;
            for (int i = 1; i <= n; i++) {
                temp1 = temp1.next;
            }
        } else if (size2 > size1) {
            int m = size2 - size1;
            for (int i = 1; i <= m; i++) {
                temp2 = temp2.next;
            }
        }
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // 100 -> 13 -> 4 -> 5 -> 12 -> 10

        Node x = new Node(90);
        Node y = new Node(9);
        x.next = y;
        y.next = d;
        // 90 -> 9 -> 5 -> 12 -> 10

        Node ans = getIntersectionNode(a,x);
        System.out.println(ans.data);
    }
}
