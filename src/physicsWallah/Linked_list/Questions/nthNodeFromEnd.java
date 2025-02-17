package physicsWallah.Linked_list.Questions;

public class nthNodeFromEnd {
    public static Node NodeFromLast(Node head,int idx){
        Node temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        temp = head;
        int m = size - idx +1;
        for(int i=1;i<=m-1;i++){
            temp = temp.next;
        }
        return temp;
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

        Node ans = NodeFromLast(a,2);
        System.out.println(ans.data);
    }
}
