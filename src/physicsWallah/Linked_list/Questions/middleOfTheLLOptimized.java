package physicsWallah.Linked_list.Questions;

public class middleOfTheLLOptimized {
    // Two pointer approach slow and fast
    // fast will move 2 x slow
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
        public static void display(Node head){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
            System.out.println();
        }
        public static Node middle(Node head){
            Node slow = head;
            Node fast = head;
            while(fast != null){
                fast = fast.next;
                if(fast == null){
                    return slow;
                }
                else{
                    fast = fast.next;
                    slow = slow.next;
                }
            }
            return slow;
        }

        public static void main(String[] args) {
            Node a = new Node(1);
            Node b = new Node(2);
            Node c = new Node(3);
            Node d = new Node(4);
            Node e = new Node(5);
            Node f = new Node(6);
            a.next = b; // 1 -> 2
            b.next = c; // 1 -> 2 -> 3
            c.next = d; // 1 -> 2 -> 3 -> 4
            d.next = e; // 1 -> 2 -> 3 -> 4 -> 5
            e.next = f; // 1 -> 2 -> 3 -> 4 -> 5 -> 6
            display(a);
            Node middle = middle(a);
            display(middle);
        }
    }
}
