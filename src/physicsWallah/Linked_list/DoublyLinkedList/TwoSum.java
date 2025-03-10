package physicsWallah.Linked_list.DoublyLinkedList;

public class TwoSum {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int val){
            data = val;
        }
    }
    public static void twoSum(Node head,int target){
        Node left = head;
        Node right = head;
        while(right.next != null){
            right = right.next;
        }
        while(left.data <= right.data){
            int sum = left.data + right.data;
            if(sum == target){
                System.out.println(left.data + " " + right.data);
                break;
            }
            else if(sum < target)left = left.next;
            else right = right.prev;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(13);
        Node e = new Node(100);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        e.prev = d;
        d.prev = c;
        c.prev = b;
        b.prev = a;
        twoSum(a , 16);
    }
}
