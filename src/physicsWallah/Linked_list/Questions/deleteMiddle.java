package physicsWallah.Linked_list.Questions;

public class deleteMiddle {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
        public static void display(Node head){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        public static void rightDelete(Node head){
            if(head.next == null) return;
            Node slow = head;
            Node fast = head;
            while(fast.next.next != null && fast.next.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            slow.next = slow.next.next;
        }
        public static void leftDelete(Node head){
            if(head.next == null) return;
            if(head.next.next == null){
                head.next = null;
                return;
            }
            Node slow = head;
            Node fast = head;
            while(fast.next.next.next != null && fast.next.next.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            slow.next = slow.next.next;
        }

        public static void main(String[] args) {
            Node a = new Node(1);
            Node b = new Node(2);
            Node c = new Node(3);
            Node d = new Node(4);
            Node e = new Node(5);
            Node f = new Node(6);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
            display(a);
            rightDelete(a);
            display(a);
            leftDelete(a);
            display(a);
            leftDelete(a);
            display(a);
            rightDelete(a);
            display(a);
            leftDelete(a);
            display(a);
        }
    }
}
