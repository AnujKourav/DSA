package physicsWallah.Linked_list.Questions;

public class nodeAtCycleBegins {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static int detectCycle(Node head){
        Node fast = head;
        Node slow = head;
        do{
            slow = slow.next;
            fast = fast.next.next;
        } while(fast != slow);
        Node temp = head;
        while(temp != slow){
            temp = temp.next;
            slow = slow.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.next = b; // 1 -> 2
        b.next = c; // 1 -> 2 -> 3
        c.next = d; // 1 -> 2 -> 3 -> 4
        d.next = e; // 1 -> 2 -> 3 -> 4 -> 5
        e.next = f; // 1 -> 2 -> 3 -> 4 -> 5 -> 6
        f.next = g; // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
        g.next = b; // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -|
        //                  ^---------------------------|
        System.out.println(detectCycle(a));
    }
}
