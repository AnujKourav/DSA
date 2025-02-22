package physicsWallah.Linked_list.Questions;

public class middleOfTheLL {
    //brute force approach
    //1. find length
    //2. travel half and return
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
        public static void middle(Node head){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            temp = head;
            for(int i=1;i<(count/2) + 1;i++){
                temp = temp.next;
            }
            display(temp);
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
            middle(a);
        }
    }
}
